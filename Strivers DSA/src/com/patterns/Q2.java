package com.patterns;

import java.util.Scanner;

public class Q2 {


    static void pattern(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {


                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern(5);

        //Q1_Pattern obj = new Q1_Pattern();
        //obj.pattern2(5);
    }
}
