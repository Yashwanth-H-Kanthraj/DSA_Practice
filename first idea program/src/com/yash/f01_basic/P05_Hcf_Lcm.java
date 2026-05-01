
// Take 2 numbers as inputs and find their HCF and LCM.

package com.yash.f01_basic;

import static java.lang.Math.min;

public class P05_Hcf_Lcm {
    public static void main(String[] args) {
        int hcf = 0;
        int num1 = 18;
        int num2 = 12;

        for (int i = 1; i <= min(num1, num2); i++) {

            // hcf = (num1 % i == 0 && num2 % i == 0) ? i:hcf;   ternary operator

            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("highest common facter for the numbers is " + hcf);


    }
}
