package com.shouvik.assignments.first_java_02;

import java.util.Scanner;

/*Q6- Input currency in rupees and output in USD.*/
public class Q6_CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency in Indian Rupees: ");
        float inr = sc.nextFloat();
        float usd = inr / 93.55f;
        System.out.println("The currency in USD Number: $" + usd);
    }
}