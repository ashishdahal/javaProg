package com.exercise.operators;

import java.util.Scanner;

public class Equilateral {

    public static boolean test(int a,int b, int c){

        return a == b && b == c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side: ");
        int side1 = sc.nextInt();
        System.out.println("Enter 2nd side: ");
        int side2 = sc.nextInt();
        System.out.println("Enter 3rd side: ");
        int side3 = sc.nextInt();

        boolean result = test(side1,side2,side3);
        System.out.println(result);

    }

}
