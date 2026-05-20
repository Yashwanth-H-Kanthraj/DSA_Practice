package com.patterns;

public class Q14 {
    public void pattern(int n) {
        int alphabets;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                alphabets = (j + 65);

                System.out.print((char) alphabets);
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Q14 obj = new Q14();
        obj.pattern(5);
        obj.pattern2(6);
    }
}
