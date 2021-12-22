package com.conditional.exercises;

import java.util.Scanner;

public class Calculateheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in feet scale");
        double feetHeight = sc.nextDouble();
        double cmHeight = 30.48 * feetHeight;
        System.out.println("The height in CM scale is "+cmHeight);
    }
}
