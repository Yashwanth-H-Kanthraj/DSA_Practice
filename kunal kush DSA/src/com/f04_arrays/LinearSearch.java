package com.f04_arrays;

public class LinearSearch {
    int[] arr = {18, 12, 9, -7, -25, 56, 14, 77, 55};

    public static void main(String[] args) {

        LinearSearch s = new LinearSearch();
        int ans = s.linearSearch6(s.arr);
        System.out.println(ans);
    }

    /*
    find the maxmun number in array and print the number and index
     */
    public void linearSearch() {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max + " @ the index ");
    }

    /* search in the array
     return index of array if it is present
     if not return -1 */
    public int linearSearch2(int num, int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == num) return index;

        }
        return -1;
    }

    /*
    return the element
     */
    public int linearSearch3(int num, int[] arr) {

        for (int element : arr) {
            if (element == num) return element;
        }

        return -1;
    }

    /*
    return true or false wheather the element contains or not
     */
    public boolean linearSearch4(int num, int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == num) return true;

        }
        return false;
    }

    public int linearSearch5(int num, int[] arr, int start, int end) {

        for (int index = start; index < end; index++) {
            int element = arr[index];

            if (element == num) return element;

        }
        return -1;
    }

    /*
    minimum number
     */
    public int linearSearch6(int[] arr) {

        int minimum = arr[0];

        for (int index = 1; index < arr.length; index++) {

            if (arr[index] < minimum) {
                minimum = arr[index];
            }
        }
        return minimum;
    }
}

