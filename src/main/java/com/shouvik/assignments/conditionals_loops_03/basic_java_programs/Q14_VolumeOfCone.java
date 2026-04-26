package com.shouvik.assignments.conditionals_loops_03.basic_java_programs;

import java.util.Scanner;

public class Q14_VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cone : ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of the Cone : ");
        float h = sc.nextFloat();
        double volumeOfCone = Math.PI * r * r * (h / 3);
        System.out.println("The volume of the cone with radius " + r + " unit and height " + h + " unit " + volumeOfCone + " units");
    }
}
