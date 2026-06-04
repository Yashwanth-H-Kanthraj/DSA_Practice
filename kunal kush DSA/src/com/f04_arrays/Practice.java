package com.f04_arrays;

public class Practice {
    int[] arr = {18, 12, 9, 14, 77, 55};


    public static void main(String[] args) {
        Practice s = new Practice();

       // s.search();
        s.contains(14);
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
    public void contains(int num) {

        int doesItContains = 0;

        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i]) doesItContains = arr[i];

        }
        System.out.println(doesItContains);
    }
}

