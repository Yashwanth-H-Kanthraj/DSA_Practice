package com.patterns;

public class Q4 {
        int n;
        void pattern3(int n) {

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(row);
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Q4 obj = new Q4();
            obj.pattern3(5);
        }
    }
