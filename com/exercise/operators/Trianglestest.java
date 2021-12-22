package com.exercise.operators;

import java.util.Scanner;

public class Trianglestest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side length of triangle");
        int S1 = sc.nextInt();
        System.out.println("Enter second side length of triangle");
        int S2 = sc.nextInt();
        System.out.println("Enter third side length of triangle");
        int S3 = sc.nextInt();

        if (S1==S2 && S2==S3){
            System.out.println("Equilateral Triangle");
        }
        else if ((S1 != S2 && S2 != S3)){
            System.out.println("scalene Triangle");
        }
        else{
            System.out.println("Isosceles Triangle");
        }

    }
}
