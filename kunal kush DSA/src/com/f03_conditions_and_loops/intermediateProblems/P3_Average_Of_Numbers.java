package com.f03_conditions_and_loops.intermediateProblems;

import java.util.Scanner;

public class P3_Average_Of_Numbers {
    public static void main(String[] args) {
        System.out.println("program started");

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        while (true) {
            System.out.print("enter the number : ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("program ended");
                break;
            }
            if (num != 0) {
                count++;
                sum = sum + num;
                average = (double) sum / count;
            }
        }
        System.out.printf("average of the %d numbers is : %.2f", count, average);
        System.out.println();
    }
}
