package com.yash.f02_practice;
// To calculate Fibonacci Series up to n numbers.

public class P06_Fibonacci_Series {

    public static void Logic1() {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void Logic2() {
        int n = 10;
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {

            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(b + " ");
        }
      //  System.out.print(b + " ");
    }


    public static void main(String[] args) {
        Logic1();
        Logic2();
    }
}
