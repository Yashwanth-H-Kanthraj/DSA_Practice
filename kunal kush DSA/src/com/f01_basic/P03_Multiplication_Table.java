package com.yash.f01_basic;

import java.util.Scanner;

public class P03_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number :");
        int num = sc.nextInt();

        System.out.println("multiplication table of a number :" + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
