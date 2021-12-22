package com.conditional.exercises;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate:");
        int xCord = sc.nextInt();
        System.out.println("Enter y-coordinate");
        int yCord = sc.nextInt();

        if (xCord>=0 && yCord>=0 ){
            System.out.println("It lies on Q1");
        }
        else if (xCord<0 && yCord>=0){
            System.out.println("It lies on Q2");
        }
        else if (xCord<0 && yCord<0){
            System.out.println("It lies on Q3");
        }
        else{
            System.out.println("It lies on Q4");
        }

    }
}
