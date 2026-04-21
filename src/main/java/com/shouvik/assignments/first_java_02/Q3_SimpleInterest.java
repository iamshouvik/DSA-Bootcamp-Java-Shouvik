package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q3 - Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.*/
public class Q3_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();

        double si = (p*t*r)/100;
        System.out.println("The simple interest: " + si);
    }
}
