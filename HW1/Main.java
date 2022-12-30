public class Main {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int w1 = word1.length(), w2 = word2.length(), min = Integer.min(w1, w2), i = 0;
        while (i < min) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
        if (i == w1) {
            result.append(word2.substring(i, w2));
        } else {
            result.append(word1.substring(i, w1));
        }
        return result.toString();
    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[result++] = nums[i];
        }
        return result;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[k--] = nums1[m--];
            } else {
                nums1[k--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[n] = nums2[n--];
        }
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
                continue;
            }

            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            char chleft = s.charAt(left);
            char chright = s.charAt(right);

            if ((s.charAt(left) >= 'A') && (s.charAt(left) <= 'Z')) {
                chleft = (char) (s.charAt(left) + 32);
            }
            if ((s.charAt(right) >= 'A') && (s.charAt(right) <= 'Z')) {
                chright = (char) (s.charAt(right) + 32);
            }
            if (chright == chleft && chleft != 0) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
