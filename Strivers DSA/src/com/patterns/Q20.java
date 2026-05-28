package com.patterns;

public class Q20 {
    static void main(String[] args) {
        Q20 obj = new Q20();
        obj.pattern(5);
        System.out.println();
        obj.pattern1(5);
    }

    public void pattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int stars = i;
            if (i > n) stars = 2 * (n) - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            if (i > n) space = 2 * (i - n);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern1(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {

            int stars = i < n ? i + 1 : 2 * n - i - 1;
            System.out.print("*".repeat(stars));

            int space = i < n ? 2 * (n - i) - 2 : 2 * (i - n) + 2;
            System.out.print(" ".repeat(space));

            System.out.print("*".repeat(stars));

            System.out.println();
        }
    }
}
