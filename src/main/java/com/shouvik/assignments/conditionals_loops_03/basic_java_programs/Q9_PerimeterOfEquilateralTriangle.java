package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q9_PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle : ");
        float s = sc.nextFloat();
        double perimeterOfEquilateralTriangle = 3 * s;
        System.out.println("The perimeter of the equilateral triangle with each side " + s + " unit is " + perimeterOfEquilateralTriangle + " unit");
    }
}
