package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q1 - Write a program to print whether a number is even or odd, also take input from the user.*/
public class Q1_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even !");
        } else {
            System.out.println("Odd !");
        }
    }
}
