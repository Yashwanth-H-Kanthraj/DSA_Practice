package com.f03_conditions_and_loops;

import java.util.Scanner;

public class P15_Maximum_Integer_Number {
    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter the number :");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            } else if (num > largest) {
                largest = num;
            }
        }
        System.out.print("Maximum number : " + largest);
    }
}


