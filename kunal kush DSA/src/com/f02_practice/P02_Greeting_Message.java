package com.yash.f02_practice;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.


public class P02_Greeting_Message {

    public static void WelcomeMessage(String name) {
        System.out.println("hi " + name + " \nWelcome to the coding World ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name :");
        String name = sc.nextLine();
        WelcomeMessage(name);
        sc.close();
    }
}
