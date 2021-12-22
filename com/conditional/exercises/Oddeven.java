package com.conditional.exercises;

import java.util.Scanner;

public class Oddeven {

    static boolean test(int a){
        if(a%2==0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be tested for odd or even");
        int number = sc.nextInt();

        if(test(number)==true){
            System.out.println("It is even");
        }
        else {
            System.out.println("It is odd");
        }

    }

}
