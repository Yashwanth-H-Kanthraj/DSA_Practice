package com.yash.f03_conditions_and_loops;

// Area Of triangle Java Program


import java.util.Scanner;

public class P6_Area_Of_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of traingle (in meters) :");
        float length = sc.nextFloat();
        System.out.print("enter breadth of traingle (in meters) :");
        float bredth = sc.nextFloat();

        double area = 0.5 * length * bredth;
        System.out.printf("area of traingle is %.3f sqm", area);

        sc.close();

    }
}
