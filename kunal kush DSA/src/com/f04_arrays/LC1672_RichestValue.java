package com.f04_arrays;

public class LC1672_RichestValue {
    public static void main(String[] args) {

    }

    int maximumWealth1(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    int maximumWealth2(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if (sum > ans) ans = sum;
        }
        return ans;
    }
}
