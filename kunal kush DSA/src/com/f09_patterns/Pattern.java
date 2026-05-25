package com.f09_patterns;

public class Pattern {
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.pattern2(5);

    }


    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void pattern2(int n) {
    }
}
