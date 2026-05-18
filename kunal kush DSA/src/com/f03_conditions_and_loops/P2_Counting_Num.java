package com.yash.f03_conditions_and_loops;

public class P2_Counting_Num {

    static void main(String[] args) {

        int number = 303251555;

        int count = 0;
        while (number > 0) {

            int rem = number % 10;
            if (rem == 5) {
                count++;
            }
            number = number / 10;
        }
        System./**/out.println(count);
    }
}
