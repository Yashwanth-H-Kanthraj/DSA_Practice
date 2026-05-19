package com.patterns;

import java.util.Scanner;

public class Q1 {

    static int n;

    static void pattern() {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


     void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows : ");
        n = sc.nextInt();
        pattern();

        //Q1_Pattern obj = new Q1_Pattern();
        //obj.pattern2(5);
    }
}