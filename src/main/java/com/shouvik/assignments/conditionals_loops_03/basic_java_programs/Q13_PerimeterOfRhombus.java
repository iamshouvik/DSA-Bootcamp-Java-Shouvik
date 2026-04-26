package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q13_PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Rhombus : ");
        float a = sc.nextFloat();
        double perimeterOfRhombus = 4 * a;
        System.out.println("The perimeter of the Rhombus with side " + a + " unit " + perimeterOfRhombus + " units");
    }
}
