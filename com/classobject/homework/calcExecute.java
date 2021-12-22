package com.classobject.homework;

import java.util.Scanner;

public class calcExecute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation calculation = new Calculation();

        System.out.println("Enter 1st Num");
        calculation.firstNumber=sc.nextInt();
        System.out.println("Enter 2nd Num");
        calculation.secondNumber=sc.nextInt();

        calculation.findSum();
        calculation.findDifference();
        calculation.findProduct();
        calculation.findQuotient();

    }

}
