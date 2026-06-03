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
}
