package com.conditional.exercises;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be tested: ");
        int x = sc.nextInt();
        if (x>=0){
            System.out.println("It is positive");
        }
        else{
            System.out.println("It is negative");
        }
    }
}
