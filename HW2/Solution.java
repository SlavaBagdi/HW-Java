package HW2;


class Solution {




    public static void main(String[]args){
    
            }
    
    //    Task 1
    //    You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
    //    connected 4-directionally (horizontal or vertical.
    //    You may assume all four edges of the grid are surrounded by water.
    //    The area of an island is the number of cells with a value 1 in the island.
    //    Return the maximum area of an island in grid. If there is no island, return 0.
    
        public int maxAreaOfIsland(int[][] grid) {
            int max = 0;
            for (int i = 0; i < grid.length; i++){
                for (int j = 0; j < grid[i].length; j++){
                    if (grid[i][j] == 1){
                        max = Math.max(max, maxAreaDfs(i, j, grid));
                    }
                }
            }
            return max;
        }
    
    
        private int maxAreaDfs(int i, int j, int[][] grid){
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                    || grid[i][j] != 1){
                return 0;
            }
            grid[i][j] = 0;
            return 1 + maxAreaDfs(i - 1, j, grid) + maxAreaDfs(i + 1, j, grid) +
                    maxAreaDfs(i, j - 1, grid) + maxAreaDfs(i, j + 1, grid);
        }
    
    
    //    Task 2
    //    You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
    //    To perform a flood fill, consider the starting pixel, plus any pixels connected
    //    4-directionally to the starting pixel of the same color as the starting pixel,
    //    plus any pixels connected 4-directionally to those pixels (also with the same color),
    //    and so on. Replace the color of all of the aforementioned pixels with color.
    //    Return the modified image after performing the flood fill.
    
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            if (image[sr][sc] == color){
                return image;
            }
            floodFillDfs(sr, sc, image[sr][sc], color, image);
            return image;
        }
    
    
        private void floodFillDfs(int sr, int sc, int color, int newColor, int[][] image){
            if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length
                    || image[sr][sc] != color){
                return;
            }
            image[sr][sc] = newColor;
            floodFillDfs(sr - 1, sc, color, newColor, image);
            floodFillDfs(sr + 1, sc, color, newColor, image);
            floodFillDfs(sr, sc - 1, color, newColor, image);
            floodFillDfs(sr, sc + 1, color, newColor, image);
        }
    
    
   
    }