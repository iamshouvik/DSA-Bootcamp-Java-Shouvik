package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q4 - Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)*/
public class Q4_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator: ");
        char op = sc.next().trim().charAt(0);
        int res = 0;
        if (op == '+') {
            res = a + b;
        } else if (op == '-') {
            res = a - b;
        } else if (op == '*') {
            res = a * b;
        } else if (op == '/') {
            if (b != 0) {
                res = a / b;
            } else {
                System.out.println("Cannot divide with ZERO !");
                System.exit(0);
            }
        } else if (op == '%') {
            if (b != 0) {
                res = a % b;
            } else {
                System.out.println("Cannot divide with ZERO !");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid Operator !");
        }
        System.out.println("The result: " + res);
    }
}
