package com.f04_arrays;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12, 24, 54, 464, 6, 847, 46};
        System.out.println(logic(nums));
        System.out.println(DigitsInNumber1(0));

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
        int NumberOfDigits = DigitsInNumber1(num);
        return NumberOfDigits % 2 == 0;
    }

    static int DigitsInNumber1(int num) {
        num = Math.abs(num);

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int DigitsInNumber2(int num) {
        return Integer.toString(Math.abs(num)).length();
    }

}
