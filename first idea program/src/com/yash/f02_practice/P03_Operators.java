package com.yash.f02_practice;
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


import java.util.Scanner;

public class P03_Operators {


    public static void Addition(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("addition of the numbers " + add);

    }

    public static void Subtract(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println(" Subtract of the numbers " + sub);

    }

    public static void Multiplication(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("Multiplication of the numbers " + mul);

    }

    public static void Division(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("Division of the numbers " + div);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :");
        int num1 = sc.nextInt();
        System.out.print("enter num2 :");
        int num2 = sc.nextInt();

        Addition(num1, num2);
        Subtract(num1, num2);
        Multiplication(num1, num2);
        Division(num1, num2);
        sc.close();
    }
}
