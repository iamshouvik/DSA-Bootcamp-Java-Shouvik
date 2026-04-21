package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q5 - Take 2 numbers as input and print the largest number.*/
public class Q5_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The largest Number: " + Math.max(a,b));
    }
}