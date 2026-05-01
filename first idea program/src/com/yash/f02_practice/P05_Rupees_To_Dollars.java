package com.yash.f02_practice;

import java.util.Scanner;

public class P05_Rupees_To_Dollars {
    public static void RupeesToDollars(double AmountInRupees) {
        double AmountInDollars = AmountInRupees / 90;
        System.out.println(AmountInRupees + " rupees is equal to " + AmountInDollars + " dollars");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amount in rupees : ");
        double AmountInRupees = sc.nextDouble();

        RupeesToDollars(AmountInRupees);
        sc.close();
    }
}
