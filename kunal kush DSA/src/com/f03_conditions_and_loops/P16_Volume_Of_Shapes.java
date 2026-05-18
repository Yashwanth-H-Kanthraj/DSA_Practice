package com.f03_conditions_and_loops;

import java.util.Scanner;

public class P16_Volume_Of_Shapes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cone();
        prism();
        sphere();
        pyramid();
        cylinder();
    }

    static void cone() {
        System.out.println("cone");
        System.out.print("enter the radius : ");
        double radius = sc.nextDouble();
        System.out.print("enter the height : ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("cone volume %.3f:", volume);
        System.out.println();
    }

    static void prism() {
        System.out.println("prism");
        System.out.print("enter the length : ");
        double length = sc.nextDouble();

        System.out.print("enter the bredth : ");
        double bredth = sc.nextDouble();

        System.out.print("enter the height : ");
        double height = sc.nextDouble();

        double base_area = (1.0 / 2) * length * bredth;

        double volume = base_area * height;
        System.out.printf("volume of pris %.3f: m", volume);
        System.out.println();
    }

    static void cylinder() {
        System.out.println("cylinder");

        System.out.print("enter the radius : ");
        double radius = sc.nextDouble();

        System.out.print("enter the height : ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.printf("volume of cylinder %.3f : ", volume);
        System.out.println();
    }

    static void sphere() {
        System.out.println("sphere");

        System.out.print("enter the radius : ");
        double radius = sc.nextDouble();

        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println(volume);
    }

    static void pyramid() {


        System.out.println("pyramid");
        System.out.print("enter the length : ");
        double length = sc.nextDouble();

        System.out.print("enter the bredth : ");
        double bredth = sc.nextDouble();

        System.out.print("enter the height : ");
        double height = sc.nextDouble();

        double base_area = (1.0 / 2) * length * bredth;

        double volume = (1.0 / 3) * base_area * height;
        System.out.println(volume);

    }
}
