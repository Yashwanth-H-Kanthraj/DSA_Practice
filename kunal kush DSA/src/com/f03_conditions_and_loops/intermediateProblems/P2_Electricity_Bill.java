package com.f03_conditions_and_loops.intermediateProblems;

import java.util.Scanner;

public class P2_Electricity_Bill {
    public static void main(String[] args) {
        System.out.println(" program started ");
        double units = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many units have been consumed : ");
        units = sc.nextDouble();


        if (units < 0 || units > 1000) {
            System.out.println("invalid units entered. cannot be calculated. ");
        }

        if (units <= 100) {
            double useage = units * 1.5;
            System.out.printf("bill generated for the %.3f units consumed is %.2f Rs. ", units, useage);
        } else if (units <= 200) {

            double useage = ((units - 100) * 2.50) + (100 * 1.50);
            System.out.printf("bill generated for the %.3f units consumed is %.2f Rs. ", units, useage);
        } else if (units <= 300) {

            double useage = ((units - 200) * 4.0) + (100 * 1.50) + (100 * 2.50);
            System.out.printf("bill generated for the %.3f units consumed is %.2f Rs. ", units, useage);
        } else {

            double useage = ((units - 300) * 5.0) + (100 * 1.50) + (100 * 2.5) + (100 * 4);
            System.out.printf("bill generated for the %.3f units consumed is %.2f Rs. ", units, useage);
        }


        sc.close();
    }
}
