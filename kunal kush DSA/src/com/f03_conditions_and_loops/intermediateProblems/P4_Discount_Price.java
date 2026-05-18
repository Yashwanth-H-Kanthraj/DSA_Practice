package com.yash.f03_conditions_and_loops.intermediateProblems;

import java.util.Scanner;

public class P4_Discount_Price {
    public static void main(String[] args) {

        System.out.println("        program started           ");

        double mrp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("maximum retail price of the product : ");
        mrp = sc.nextFloat();

        System.out.println();

        System.out.print("enter discount percentage: ");
        double discount = sc.nextDouble();
        double final_price = mrp - (mrp * (discount / 100.0));

        System.out.printf("%.3f Rs is the final price of the product after discount of %.2f Rs. ", final_price, discount);
        sc.close();
    }
}
