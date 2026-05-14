package com.yash.f03_conditions_and_loops;

import java.util.Scanner;

public class P7_Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of rectangle (in meters) :");
        float length = sc.nextFloat();
        System.out.print("enter breadth of rectangle (in meters) :");
        float bredth = sc.nextFloat();

        double area = length * bredth;
        System.out.printf("area of rectangle is %.3f sqm", area);

        sc.close();

    }
}
