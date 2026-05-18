package com.yash.f03_conditions_and_loops;

import java.util.Scanner;

public class P12_Area_USing_Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                
                Triangle\s
                Circle\s
                Rectangle\s
                Isosceles_Triangle\s
                Rhombus\s
                Parallelogram\s
                Equilateral_Triangle\s
                enter the shape of the area :
                """);
        System.out.println();

        String shape = sc.next();

        switch (shape) {
            case "Triangle" -> {
                System.out.print("enter length of traingle (in meters) :");
                float length = sc.nextFloat();
                System.out.print("enter breadth of triangle (in meters) :");
                float bredth = sc.nextFloat();

                double area = 0.5 * length * bredth;
                System.out.printf("area of triangle is %.3f sqm", area);

            }
            case "Circle" -> {
                System.out.print("enter the radius in meters :");
                float radius = sc.nextFloat();

                double area = Math.PI * radius * radius;
                System.out.printf("area of the circle of radius " + radius + "m  is %.4f ", area);

            }
            case "Rectangle" -> {
                System.out.print("enter length of rectangle (in meters) :");
                float length = sc.nextFloat();
                System.out.print("enter breadth of rectangle (in meters) :");
                float bredth = sc.nextFloat();

                double area = length * bredth;
                System.out.printf("area of rectangle is %.3f sqm", area);

            }
            case "Equilateral_Triangle" -> {
                System.out.print("enter the side length in meters :");
                int side = sc.nextInt();


                double area = (Math.sqrt(3) / 4) * side * side;
                System.out.printf("area of the Equilateral_Triangle of %3d m side length is %.3f sqm ", side, area);

            }
            case "Isosceles_Triangle" -> {
                System.out.print("enter the side and base in meters :");
                int s1 = sc.nextInt();
                //int s2 = s1 * Math.max(sc.nextInt(), sc.nextInt());
                int base = sc.nextInt();

                double height = Math.sqrt(s1 * s1 - base * base);
                System.out.printf("height Of Isosceles Triangle is %.2f sqm", height);
                double area = 0.5 * base * height;

                System.out.printf("Area Of Isosceles Triangle is %.2f sqm", area);

            }
            case "Parallelogram" -> {
                System.out.print("enter the base and height in meters : ");
                int b = sc.nextInt();
                int h = sc.nextInt();

                double area = b * h;
                System.out.print("area of the Parallelogram is : " + area);

            }
            case "Rhombus" -> {
                System.out.print("enter the diagonal1 and diagonal2 length in meters : ");
                int d1 = sc.nextInt();
                int d2 = sc.nextInt();

                double area = (double) (d1 * d2) / 2;
                System.out.print("area of the rhombus is : " + area);
            }
            default -> System.out.println("Invalid Shape--- enter the valid shape : ");
        }
        sc.close();
    }
}

