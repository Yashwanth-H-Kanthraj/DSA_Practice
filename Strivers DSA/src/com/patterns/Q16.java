package com.patterns;

public class Q16 {
    public static void main(String[] args) {
        Q16 obj = new Q16();
        obj.pattern(5);

    }

    public void pattern(int n) {

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A'+ i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
