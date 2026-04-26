package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q12_PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        float a = sc.nextFloat();
        double perimeterOfSquare = 2 * Math.PI * a;
        System.out.println("The perimeter of the square with side " + a + " is " + perimeterOfSquare + " units");
    }
}
