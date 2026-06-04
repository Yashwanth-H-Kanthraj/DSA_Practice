package com.f04_arrays;

import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {
        char target = 'a';
        String name = "Yashwanth";

        System.out.println(search3(target, name, 1, 4));
        // System.out.println(Arrays.toString(name.toCharArray()));

    }

    // method 1
    static boolean search1(char target, String str) {
        if (str.isEmpty()) return false;

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) return true;
        }
        return false;
    }

    // method 2 _ it converts the name to array
    static boolean search2(char target, String str) {
        if (str.isEmpty()) return false;

        for (char ch : str.toCharArray()) {
            if (ch == target) return true;
        }
        return false;
    }

    // search in range from 1 to 5
    static boolean search3(char target, String str, int start, int end) {
        if (str.isEmpty()) return false;

        for (int index = start; index < end; index++) {
            if (target == str.charAt(index)) return true;
        }
        return false;
    }
}
