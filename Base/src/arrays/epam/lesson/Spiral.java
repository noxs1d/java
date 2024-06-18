package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];

        int value = 1;
        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result[top][i] = value++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result[i][right] = value++;
            }
            right--;

            // Traverse from right to left, if still within valid rows
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = value++;
                }
                bottom--;
            }

            // Traverse from bottom to top, if still within valid columns
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = value++;
                }
                left++;
            }
        }

        return result;    }
}
