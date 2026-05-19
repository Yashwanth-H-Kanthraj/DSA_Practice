package com.patterns;

public class Q8 {

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * (n - row) + 1; star++) {
                System.out.print("*");
            }
            for (int tspace = 1; tspace <= row - 1; tspace++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
