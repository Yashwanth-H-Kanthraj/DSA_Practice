package com.f04_arrays;

public class sample {
    int[] arr = {18, 12, 9, 14, 77, 55};


    public static void main(String[] args) {
        sample s = new sample();
        s.search();
    }

    public void search() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    public void search1() {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end); // swap the two elements
            start++;               // move start forward
            end--;                 // move end backward
        }
        // stop when start >= end (pointers crossed)
    }
}
