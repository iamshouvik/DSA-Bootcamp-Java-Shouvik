package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q15_VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the Prism : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of the Prism : ");
        float h = sc.nextFloat();
        double volumeOfPrism = b * h;
        System.out.println("The volume of the prism with base " + b + " unit and height " + h + " unit " + volumeOfPrism + " units");
    }
}
