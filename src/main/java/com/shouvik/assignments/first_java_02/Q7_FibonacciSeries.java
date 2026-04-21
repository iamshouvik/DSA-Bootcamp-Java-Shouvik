package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q7- To calculate Fibonacci Series up to n numbers.*/
public class Q7_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a=0,b=1, c=0, count=3;
        System.out.print(a + " ");
        System.out.print(b + " ");
        do{
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
            count++;
        }while(count<=n);
    }
}