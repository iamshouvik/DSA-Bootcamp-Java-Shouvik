package com.shouvik.dsa_algomaster_io._03_strings._01_string_basics;

import java.util.Arrays;

public class Q1_ReverseString {
    public static void reverseString_approach1(char[] s) {
        /*Time Complexity: O(n). We perform exactly floor(n/2) swaps. Each swap is O(1), so the total is O(n).
          Space Complexity: O(1). Only a few variables (left, right, temp). No additional data structures.*/
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char t = s[left];
            s[left] = s[right];
            s[right] = t;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        reverseString_approach1(s1);

        char[] s2 = {'H','a','n','n','a','h'};
        reverseString_approach1(s2);
    }
}
