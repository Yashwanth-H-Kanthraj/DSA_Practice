package com.patterns;

public class Q15 {
    public void pattern(int n) {

        for (int i = n; i > 0; i--) {
            for (char j = 'A'; j <'A' + i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q15 obj = new Q15();
        obj.pattern(3);

    }
}
