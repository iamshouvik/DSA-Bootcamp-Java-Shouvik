package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q3_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle : ");
        float l = sc.nextFloat();
        System.out.println("Enter the breadth of the Triangle : ");
        float b = sc.nextFloat();
        double areaOfRectangle = l * b;
        System.out.println("The area of the triangle with length " + l + " unit and breadth " + b + " unit is " + areaOfRectangle + " sq. units");
    }
}
