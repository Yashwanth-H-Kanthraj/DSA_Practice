package com.patterns;

public class Q22 {
    static void main(String[] args) {
        Q22 obj = new Q22();
        obj.pattern(7);
        obj.pattern1(6);
    }

    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print(4);
                } else if (i == 1 || j == 1 || i == n - 2 || j == n - 2) {
                    System.out.print(3);
                } else if (i == 2 || j == 2 || i == n - 3 || j == n - 3) {
                    System.out.print(2);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }


    public void pattern1(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - minDist);

            }
            System.out.println();
        }
    }
}
