package com.patterns;

public class Q5 {
    int n;

    void pattern3(int n) {


        for (int row = 5; row <= n && row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q5 obj = new Q5();
        obj.pattern3(5);
    }

}
