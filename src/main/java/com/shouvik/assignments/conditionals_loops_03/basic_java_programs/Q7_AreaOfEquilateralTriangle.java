package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q7_AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Equilateral Triangle : ");
        float a = sc.nextFloat();
        double areaOfEquilateralTriangle = (Math.sqrt(3) * a * a) / 4;
        System.out.println("The area of the Equilateral Triangle with each side " + a + " unit is " + areaOfEquilateralTriangle + " sq. units");
    }
}
