package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q6_AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first diagonal of the Rhombus : ");
        float d1 = sc.nextFloat();
        System.out.println("Enter the second diagonal of the Rhombus : ");
        float d2 = sc.nextFloat();
        double areaOfRhombus = (d1 * d2) / 2;
        System.out.println("The area of the Rhombus with first diagonal " + d1 + " unit and second diagonal " + d2 + " unit is " + areaOfRhombus + " sq. units");
    }
}
