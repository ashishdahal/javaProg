package com.loopexercise.java;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to get the factorial of: ");

        int factorialNum= input.nextInt();
        int totalFactorial= 1;
        for (int i = factorialNum; i>=1; i--){
            System.out.print(i);
            totalFactorial= totalFactorial *i;
            if(i!=1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + totalFactorial);
    }

}
