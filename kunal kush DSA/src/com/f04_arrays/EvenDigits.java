package com.f04_arrays;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12, 24, 54, 4564, 6, 847, 46};
        System.out.println(logic(nums));

    }

    public static int logic(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean Even(int num) {
        int NumberOfDigits = DigitsInNumber(num);
        return NumberOfDigits % 2 == 0;
    }

    static int DigitsInNumber(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
