package com.yash.conditions_and_loops;

public class P3_Reverse_number {

    public static void main(String[] args) {
        int n = 102514;

        int ans = 0;


        while (n > 0) {
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
