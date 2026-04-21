package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q4_AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Isosceles Triangle : ");
        float b = sc.nextFloat();
        System.out.println("Enter the equal side of the Isosceles Triangle : ");
        float a = sc.nextFloat();
        double areaOfIsoscelesTriangle = (b / 4) * Math.sqrt((4 * Math.pow(a, 2)) - Math.pow(b, 2));
        System.out.println("The area of the Isosceles Triangle with base " + b + " unit and equal sides of " + a + " unit is " + areaOfIsoscelesTriangle + " sq. units");
    }
}
