package com.yash.conditions_and_loops;

// Area Of Circle Java Program

import java.util.Scanner;

public class P5_Area_Of_Cirle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the radius in meters :");
        float radius = sc.nextFloat();

        double area = Math.PI * radius * radius;
        System.out.printf("area of the circle of radius " + radius + "m  is %.4f ", area);

        sc.close();
    }
}