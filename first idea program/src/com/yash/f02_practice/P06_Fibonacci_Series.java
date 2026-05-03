package com.yash.f02_practice;

public class P06_Fibonacci_Series {

    public static void Logic() {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        Logic();
    }
}
