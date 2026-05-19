package com.patterns;

public class Q7 {


    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = n - 1; space >= row && row > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            for (int tspace = n - 1; tspace >= row && row > 0;tspace--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public void pattern7(int N) {
        // Outer loop for rows
        for (int row = 0; row < N; row++) {

            // Print leading spaces
            for (int space = 0; space < N - row - 1; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int space = 0; space < 2 * row + 1; space++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int space = 0; space < N - row - 1; space++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
        Q7 obj = new Q7();
        obj.pattern7(5);
    }
}


