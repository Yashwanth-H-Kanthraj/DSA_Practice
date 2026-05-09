package com.yash.conditions_and_loops;

import java.util.Scanner;

public class P8_Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side and base in meters :");
        int s1 = sc.nextInt();
        int s2 = s1;
        int base = sc.nextInt();

        double height = Math.sqrt(s1 * s1 - base * base);
        System.out.printf("height Of Isosceles Triangle is %.2f sqm", height);
        double area = 0.5 * base * height;


        System.out.printf("Area Of Isosceles Triangle is %.2f sqm", area);

        sc.close();

    }
}
