package com.exercise.operators;

import java.util.Scanner;

public class FindLargest {

   static int largest(int x,int y, int z){
       return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int biggestNumber;
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();

        biggestNumber = largest(a,b,c);

        System.out.println("The largest number is: "+biggestNumber);

    }
}
