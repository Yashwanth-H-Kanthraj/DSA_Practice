package com.yash.f03_conditions_and_loops;

import java.util.Scanner;

public class P13_Perimeter_Using_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the shape : ");
        String shape = sc.next();
        switch (shape) {

            case "Circle" -> {

                System.out.print("enter radius : ");
                int radius = sc.nextInt();
                double perimeter = 2 * Math.PI * radius;
                System.out.printf("perimeter of the circle is %.3f", perimeter);


            }
            case "Equilateral_Triangle" -> {
                System.out.print("enter side length : ");
                int side = sc.nextInt();
                double perimeter = side * 3.0;
                System.out.printf("perimeter of the Equilateral_Triangle  is %.3f", perimeter);

            }
            case "Parallelogram/Rectangle" -> {
                System.out.print("enter side1 length : ");
                int side1 = sc.nextInt();
                System.out.print("enter side2 length : ");
                int side2 = sc.nextInt();

                double perimeter = 2 * (side1 + side2);
                System.out.printf("perimeter of the Parallelogram/Rectangle is %.3f", perimeter);

            }
            case "Rhombus/Square" -> {
                System.out.print("enter side1 length : ");
                int side = sc.nextInt();


                double perimeter = 4 * side;
                System.out.printf("perimeter of the Rhombus/Square is %.3f", perimeter);

            }
            default -> System.out.println("invalid shape.  enter a valid chape :");
        }
    }
}

