package com.patterns;

public class Q20 {
    public static void main(String[] args) {
        Q20 obj = new Q20();
        obj.pattern(5);
    }

    public void pattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
