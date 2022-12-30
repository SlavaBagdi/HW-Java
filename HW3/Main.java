package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(10);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(2);
        arr1.add(2);
        arr1.add(9);
        arr2.add(10);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);
        arr2.add(2);
        arr2.add(2);
        arr2.add(9);
        System.out.println(arrayEquality(arr1, arr2));
        System.out.println(arrayNumEquality(arr1, arr2, 5));
        System.out.println(sortEvenNumbs(arr1));
        System.out.println(removeEvenNumbs(arr1));

    }


    //    На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
    //    Нужно реализовать алгоритм, не использовать метод equals.
    public static boolean arrayEquality(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr1.size() != arr2.size()) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2.get(i)) {
                return false;
            }
        }
        return true;
    }


    //    На вход методу приходят два ArrayList<Integer> и целое число num. Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.
    public static boolean arrayNumEquality(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int num) {
        int numCount = 0;

        for (int item : arr1) {
            if (item == num) numCount++;
        }
        for (int item : arr2) {
            if (item == num) numCount--;
        }

        return numCount == 0;
    }


    //    На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа. Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
    public static ArrayList<Integer> sortEvenNumbs(ArrayList<Integer> arr) {
        int count = 0;
        ArrayList<Integer> arrEvNumb = new ArrayList<>();
        for (int item : arr) {
            if (item % 2 == 0) {
                arrEvNumb.add(item);
            }
        }
        Collections.sort(arrEvNumb);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.set(i, arrEvNumb.get(count));
                count++;
            }
        }
        return arr;
    }


    //    На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)
    public static ArrayList<Integer> removeEvenNumbs(ArrayList<Integer> arr) {
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current % 2 == 0) {
                iterator.remove();
            }
        }
        return arr;
    }
}