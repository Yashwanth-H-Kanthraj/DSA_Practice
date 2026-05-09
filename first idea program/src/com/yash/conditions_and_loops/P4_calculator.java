package com.yash.conditions_and_loops;

import java.util.Scanner;


public class P4_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("enter the operator");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("enter the two numbers");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '/') {
                    ans = n1 / n2;
                }
                if (op == '%') {
                    ans = n1 % n2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid operator");
            }
            System.out.println(ans);
        }
    }
}
