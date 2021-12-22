package com.function.exercise;

import java.util.Scanner;

public class GetTotal {

    public static int getSum (int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int I1 = sc.nextInt();
        System.out.println("Enter 2st integer");
        int I2 = sc.nextInt();

        System.out.println("The sum is :"+getSum(I1,I2));

    }

}
