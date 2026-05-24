package com.shouvik.dsa_algomaster_io._03_strings._01_string_basics;

public class Q3_FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr_approach1(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i=0;i<=n-m;i++){
            int j = 0;
            while(j<m && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }

    public static int strStr_approach2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        int[] lps = buildLPS(needle, m);

        int i = 0;
        int j = 0;
        while(i < n){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }

            if(j == m){
                return i - m;
            } else if (i < n && haystack.charAt(i) != needle.charAt(j)){
                if(j > 0){
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    private static int[] buildLPS(String needle, int m) {
        int[] lps = new int[m];
        int length = 0;
        int i = 1;

        while(i < m){
            if(needle.charAt(i) == needle.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            } else {
                if(length > 0){
                    length = lps[length-1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr_approach2(haystack, needle));

        haystack = "leetcode";
        needle = "leeto";

        System.out.println(strStr_approach2(haystack, needle));
    }
}
