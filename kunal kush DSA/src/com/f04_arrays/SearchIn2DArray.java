package com.f04_arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 64},
                {36, 45, 89, 52},
                {78, 64, 84}
        };

        int target = 46;

        System.out.println(search(arr, target));

    }

    public static int search(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if (arr[rows][col] == target) return target;

            }
        }
        return Integer.MAX_VALUE;

    }
}
