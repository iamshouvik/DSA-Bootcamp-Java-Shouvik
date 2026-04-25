package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q8_Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        double perimeterOfCircle = 2 * Math.PI * r;
        System.out.println("The perimeter of the circle with radius " + r + " unit is " + perimeterOfCircle + " unit");
    }
}
