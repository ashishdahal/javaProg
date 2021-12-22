package com.conditional.exercises;

import java.util.Scanner;

public class Integerscompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int x = sc.nextInt();
        System.out.println("enter second number: ");
        int y = sc.nextInt();

        if (x==y){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }

    }

}
