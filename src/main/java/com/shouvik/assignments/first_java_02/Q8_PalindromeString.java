package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q8- To find out whether the given String is Palindrome or not.*/
public class Q8_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        StringBuilder sRev= new StringBuilder();
        int len = s.length();
        for(int i=len-1;i>-1;i--){
            char ch = s.charAt(i);
            sRev.append(ch);
        }
        System.out.println(s.contentEquals(sRev)?s + " is Palindrome !":s + " is not Palindrome !");
    }
}