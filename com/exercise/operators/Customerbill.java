package com.exercise.operators;

import java.util.Scanner;

public class Customerbill {

    public static double unitTest(double unitConsumed){

        if (unitConsumed<0) {
            System.out.println("Enter valid unit");
        }
        else if(unitConsumed>=0 && unitConsumed<=199) return unitConsumed * 1.20;
        else if (unitConsumed>=200 && unitConsumed<400) return unitConsumed * 1.50;
        else if (unitConsumed>=400 && unitConsumed<600) return unitConsumed * 1.80;
        return unitConsumed * 2.00;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer ID: ");
        int Id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Unit consumed by Customer: ");
        double Unit = sc.nextDouble();
        double Unit_con = unitTest(Unit);

        System.out.println("Customer IDNO: "+Id);
        System.out.println("Customer Name: "+name);
        System.out.println("unit Consumed: "+Unit);
        System.out.println("Amount Charges @"+(Unit_con/Unit)+" per unit: "+Unit_con);

        if(Unit_con>400){
            System.out.println("Surcharge Amount :"+(Unit_con*15)/100);
        }


    }

}


