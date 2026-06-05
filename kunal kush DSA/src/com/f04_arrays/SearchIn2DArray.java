package com.f04_arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    int[][] arr = {
            {23, 464, 64},
            {36, 45, 89, 52, 71},
            {78, 64, 85}
    };

    public static void main(String[] args) {
        SearchIn2DArray s = new SearchIn2DArray();

        int target = 71;

        // System.out.println(Arrays.toString(search2(s.arr, target)));

        System.out.println(s.search4(s.arr));
    }

    // search a element in the 2d array
    public static int search1(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if (arr[rows][col] == target) return target;

            }
        }
        return Integer.MAX_VALUE;
    }

    // search the element and return the row and column index
    public static int[] search2(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // search the maxiumum value
    public void search3() {
        int maximum = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] > maximum) {
                    maximum = arr[row][col];
                }
            }
        }
        System.out.println(maximum);
    }

    public int search4(int[][] arr) {
        int maximum = Integer.MIN_VALUE;

        for (int[] relement : arr) {
            for (int celement : relement) {
                if (celement > maximum) {

                    maximum = celement;
                }
            }
        }
        return maximum;
    }


}
