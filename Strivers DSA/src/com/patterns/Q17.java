package com.patterns;

public class Q17 {
    public static void main(String[] args) {
        Q17 obj = new Q17();
        obj.pattern(5);
    }

    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            for (char j = (char)('A' + i - 1); j >= 'A'; j--) {
                System.out.print(j);
            }
            for (int j = 0; j <= (n - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
