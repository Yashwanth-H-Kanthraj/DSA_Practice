package com.yash.f01_basic;

import java.util.Scanner;

public class P04_Sum_Until_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("enter the number(type x to stop)");

        while (sc.hasNextInt()) {
            System.out.println("enter the number(type x to stop)");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("sum of all the numbers " + sum);
        sc.close();
    }
}
