package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q1_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        double areaOfCircle = Math.PI * r * r;
        System.out.println("The area of the circle with radius " + r + " is " + areaOfCircle + " sq. units");
    }
}
