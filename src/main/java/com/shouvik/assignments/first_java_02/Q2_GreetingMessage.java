package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

public class Q2_GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
