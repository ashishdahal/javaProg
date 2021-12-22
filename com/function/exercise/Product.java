package com.function.exercise;

import java.util.Scanner;

public class Product {
    public static int getProduct (int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int I1 = sc.nextInt();
        System.out.println("Enter 2st integer");
        int I2 = sc.nextInt();

        System.out.println("The Product is :"+getProduct(I1,I2));

    }
}
