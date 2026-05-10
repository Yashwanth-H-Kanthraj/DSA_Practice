package com.yash.conditions_and_loops;

import java.util.Scanner;

public class P10_Summing_All_The_Integers {
    public static void main(String[] args) {

        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");

        while (true){
            int num = sc.nextInt();

            if (num == 0){
               break;
           }else {
                ans = num+ans;

           }
         //  System.out.print(num+" ");
        }
        System.out.print(ans);
    }
}
