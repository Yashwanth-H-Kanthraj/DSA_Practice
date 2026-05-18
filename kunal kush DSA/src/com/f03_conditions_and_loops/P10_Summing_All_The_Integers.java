package com.f03_conditions_and_loops;

import java.util.Scanner;

public class P10_Summing_All_The_Integers {
    public static void main(String[] args) {

        int ans = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter the number :");
            int num = sc.nextInt();


            if (num == 0) {
                break;
            }
            ans = num + ans;
            System.out.print(num + " ");
            System.out.println();
        }

        System.out.printf("sum of all the integers is %d", ans);
    }
}
