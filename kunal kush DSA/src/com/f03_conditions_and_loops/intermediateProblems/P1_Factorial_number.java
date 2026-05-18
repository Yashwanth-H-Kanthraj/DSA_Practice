package com.yash.f03_conditions_and_loops.intermediateProblems;

import java.util.Scanner;

public class P1_Factorial_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the integer : ");

        int integer = sc.nextInt();
        int factorial = 1;


        for (int i = integer; i >= 1; i--) {
            factorial = factorial * i;
            System.out.print(i + "");
            System.out.println();
        }
        System.out.printf("factorial of integer is %d: ", factorial);
        sc.close();
    }

}
