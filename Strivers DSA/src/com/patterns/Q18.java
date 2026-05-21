package com.patterns;

public class Q18 {
    public static void main(String[] args) {
        Q18 obj = new Q18();
        obj.pattern(5);

    }

    public void pattern(int n) {
        for (int i = 0; i < n; i++) {

            for (char j = (char) ('A' + n - 1); j >= (char) ('A' + n - 1 - i); j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
