package com.exercise.operators;

import java.util.Scanner;

public class Angletest {

    public static double sum (double x, double y, double z){
        return x+y+z;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Angle: ");
        double S1 = sc.nextDouble();
        System.out.println("Enter 2nd Angle: ");
        double S2 = sc.nextDouble();
        System.out.println("Enter 3rd Angle: ");
        double S3 = sc.nextDouble();

        double sumAngle = sum(S1,S2,S3);

        if (sumAngle==180){
            System.out.println("The triangle is VALID");
        }
        else{
            System.out.println("The triangle is INVALID");
        }


    }

}
