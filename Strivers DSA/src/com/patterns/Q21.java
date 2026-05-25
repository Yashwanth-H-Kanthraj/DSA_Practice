package com.patterns;

public class Q21 {
    static void main(String[] args) {
        Q21 obj = new Q21();
        obj.pattern(10);
    }

    /*
    row     pattern     column
    0       ****        4stars for 1st and last
    1       *  *        2stars 2 stars from 2nd row
    2       *  *        3stars
    3       ****        4stars


     */
    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


}
