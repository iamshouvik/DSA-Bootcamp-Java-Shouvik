package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q9- To find Armstrong Number between two given number.*/
public class Q9_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = sc.nextInt();
        int numberOfDigits = numberOfDigits(num);
        System.out.println(checkArmStrong(num, numberOfDigits)?num + " is an Armstrong Number !": num + " is not an Armstrong number !");
        System.out.println("Enter second number: ");
        num = sc.nextInt();
        numberOfDigits = numberOfDigits(num);
        System.out.println(checkArmStrong(num, numberOfDigits)?num + " is an Armstrong Number !": num + " is not an Armstrong number !");
    }

    public static int numberOfDigits(int num) {
        int numberOfDigits = 0;
        while (num > 0) {
            numberOfDigits++;
            num /= 10;
        }
        return numberOfDigits;
    }

    public static boolean checkArmStrong(int num, int numberOfDigits) {
        int numArm = 0, copy = num;
        while (copy > 0) {
            int rem = copy % 10;
            numArm = numArm + (int)Math.pow(rem, numberOfDigits);
            copy /= 10;
        }
        return num == numArm;
    }
}