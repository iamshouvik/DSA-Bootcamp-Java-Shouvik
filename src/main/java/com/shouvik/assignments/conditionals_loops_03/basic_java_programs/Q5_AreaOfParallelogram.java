package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q5_AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Parallelogram : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of the Parallelogram : ");
        float h = sc.nextFloat();
        double areaOfParallelogram = b * h;
        System.out.println("The area of the Parallelogram with base " + b + " unit and height " + h + " unit is " + areaOfParallelogram + " sq. units");
    }
}
