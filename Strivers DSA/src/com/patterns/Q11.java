package com.patterns;

public class Q11 {

    /*
    row         pattern         column
    1           1               1
    2           01              2
    3           101             3
     */

    int start;

    public void pattern(int n) {
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) start = 1;
            else start = 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;

            }
            System.out.println();
        }
    }


    static void main(String[] args) {
        Q11 obj = new Q11();
        obj.pattern(5);
    }
}
