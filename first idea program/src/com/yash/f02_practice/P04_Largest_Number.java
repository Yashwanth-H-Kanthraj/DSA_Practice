package com.yash.f02_practice;
//Take 2 numbers as input and print the largest number.


import java.util.Scanner;

public class P04_Largest_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("number " + num1 + " is greater than " + num2+".");
        } else if (num1 == num2) {
            System.out.println("both numbers are equal.");
        } else {
            System.out.println("invalid character please enther the number.");
        }
        sc.close();
    }
}
