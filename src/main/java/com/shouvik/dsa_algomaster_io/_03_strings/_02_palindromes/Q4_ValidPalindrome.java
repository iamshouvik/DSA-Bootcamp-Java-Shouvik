package com.shouvik.dsa_algomaster_io._03_strings._02_palindromes;

public class Q4_ValidPalindrome {

    public static boolean isPalindrome_approach1(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int i = 0;
        int j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i) == sb.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    /*Time Complexity: O(n). We scan the string once to build the cleaned version, then reverse it, then compare. Three linear passes, so O(n) overall.
      Space Complexity: O(n). We create a new cleaned string that could be up to n characters long, plus another copy for the reversed version.*/
    public static boolean isPalindrome_approach2(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        String forward = cleaned.toString();
        String backward = cleaned.reverse().toString();
        return forward.equals(backward);
    }

    /*Time Complexity: O(n). Each pointer moves from one end to the other, visiting each character at most once. Total work is proportional to the length of the string.
      Space Complexity: O(1). We only use two integer pointers and no additional data structures. The input string is not modified.*/
    public static boolean isPalindrome_approach3(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare lowercase versions
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if(isPalindrome_approach3(s)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        s = "race a car";
        if(isPalindrome_approach3(s)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        s = " ";
        if(isPalindrome_approach3(s)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        s = "0P";
        if(isPalindrome_approach3(s)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
