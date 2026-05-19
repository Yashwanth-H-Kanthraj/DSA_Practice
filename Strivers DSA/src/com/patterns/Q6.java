package com.patterns;

public class Q6 {

    static void problem(int n){
        for (int row = 5; row <=n&&row>0;row--){
            for (int col=1;col <=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        problem(5);
    }
}
