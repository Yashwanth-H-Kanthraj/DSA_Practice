package com.patterns;

import java.util.Scanner;

public class Q3 {
    static int n;

    static void numPattern() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number : ");
         n = sc.nextInt();
        numPattern();
    }
}
