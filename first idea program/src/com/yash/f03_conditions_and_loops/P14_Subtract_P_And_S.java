package com.yash.f03_conditions_and_loops;

import java.util.Scanner;

public class P14_Subtract_P_And_S {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter the num2 : ");
        int num2= sc.nextInt();

        int product = num1 * num2;
        int sum = num1+num2;

        int subtract = Math.max(product,sum)-Math.min(product,sum);

        System.out.printf("Subtraction of the Product and Sum of Digits of an Integer is %d",subtract);


    }
}
