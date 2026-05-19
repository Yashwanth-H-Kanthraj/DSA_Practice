package com.patterns;

public class Q9 {
    static void patternup(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = n - 1; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            for (int tspace = n - 1; tspace >= row; tspace--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void patterndown(int n) {
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
        patternup(5);
        patterndown(5);
    }
}
