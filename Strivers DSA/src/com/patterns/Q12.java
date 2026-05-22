package com.patterns;

    /*     pattern
        1______2
        12____21
        123__321
        12344321     */

public class Q12 {
    public static void main(String[] args) {
        Q12 obj = new Q12();
        obj.pattern(10);
        obj.pattern2(9);

    }

    public void pattern(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        // Initial number of spaces in the first row
        int spaces = 2 * (n - 1);

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop to print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Inner loop to print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Inner loop to print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after printing the row
            System.out.println();

            // Decrease spaces by 2 after each row
            spaces -= 2;
        }
    }
}

