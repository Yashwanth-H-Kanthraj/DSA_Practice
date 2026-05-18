package com.yash.f03_conditions_and_loops;

import java.util.Scanner;

public class P14_Subtract_P_And_S {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num : ");
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;

        while (num > 0) {

            int temp = num % 10;
            num = num / 10;
            product = product * temp;
            sum = sum + temp;
        }
        int subtraction = product - sum;
        System.out.println("product     : " + product);
        System.out.println("sum         : " + sum);
        System.out.println("Difference  : " + subtraction);
    }
}
