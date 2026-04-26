package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q11_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle : ");
        float l = sc.nextFloat();
        System.out.println("Enter the breadth of the Rectangle : ");
        float b = sc.nextFloat();
        double perimeterOfRectangle = 2 * (l + b);
        System.out.println("The perimeter of the Rectangle with length " + l + " unit and breadth " + b + " unit is " + perimeterOfRectangle + " sq. units");
    }
}
