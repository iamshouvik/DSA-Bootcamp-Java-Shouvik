package com.shouvik.dsa_algomaster_io._03_strings._01_string_basics;

public class Q2_LengthOfLastWord {
    public static int lengthOfLastWord_approach1(String s) {
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters in the last word
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord_approach1(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord_approach1(s2));;
    }
}
