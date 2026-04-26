package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q10_PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Parallelogram : ");
        float b = sc.nextFloat();
        System.out.println("Enter the side of the Parallelogram : ");
        float a = sc.nextFloat();
        double perimeterOfParallelogram = 2 * (a + b);
        System.out.println("The perimeter of the Parallelogram with side " + a + " unit and base " + b + " unit is " + perimeterOfParallelogram + " sq. units");
    }
}
