package com.yash.f02_practice;

import java.util.Scanner;


public class P01_Even_Odd {

    public static void M1_IfCondition(int num) {
        if (num % 2 == 0) {
            System.out.println("The given number " + num + " is even.");
        } else {
            System.out.println("The given number " + num + " is odd.");
        }
    }

    public static void M2_TernaryOperatorMthod(int num) {
        String res = (num % 2 == 0) ? "The given number " + num + " is even." : "The given number " + num + " is odd.";
        System.out.println(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();

        P01_Even_Odd.M1_IfCondition(num);
        P01_Even_Odd.M2_TernaryOperatorMthod(num);
        sc.close();

    }
}
