package com.loopexercise.java;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an positive integer:");
        int posInteger = input.nextInt();

        for (int i = 1; i<=10;i++ ){
            int multiplicationTable =posInteger*i;
            System.out.println(posInteger +" * "+ i + " = "+multiplicationTable);
        }
    }
}
