package com.f04_arrays;

public class Practice {
    int[] arr = {18, 12, 9, 14, 77, 55};

    public static void main(String[] args) {

        Practice s = new Practice();

        // s.search();
        System.out.println("num is  at the index  " + (s.contains(14, s.arr)));
    }

    /*
    find the maxmun number in array and print the number and index
     */
    public void search() {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max + " @ the index ");
    }

    /* search in the array
     return index of array if it is present
     if not return -1 */
    public int contains(int num, int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == num) return index;

        }
        return -1;
    }
}

