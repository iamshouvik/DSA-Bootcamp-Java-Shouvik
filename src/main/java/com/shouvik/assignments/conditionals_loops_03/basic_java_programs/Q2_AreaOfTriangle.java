package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q2_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of the Triangle : ");
        float h = sc.nextFloat();
        double areaOfTriangle = ((double) 1 / 2) * b * h;
        System.out.println("The area of the triangle with base " + b + " unit and height " + h + " unit is " + areaOfTriangle + " sq. units");
    }
}
