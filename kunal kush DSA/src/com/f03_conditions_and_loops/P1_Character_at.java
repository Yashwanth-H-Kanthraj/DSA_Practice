package com.f03_conditions_and_loops;

import java.util.Scanner;

public class P1_Character_at {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name here = ");
        String name = sc.nextLine().trim();

        char ch = name.charAt(0);
        System.out.println(ch);


        }
    }
