package com.yash.f01_basic;

import java.util.Scanner;

public class P02_Sum_Of_Two_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num1 :");
        int num1 = sc.nextInt();
        System.out.print("enter the num2 :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of "+num1+" and "+num2+" is "+ sum);
    }
}
