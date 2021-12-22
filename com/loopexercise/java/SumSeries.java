package com.loopexercise.java;

import java.util.Scanner;

public class SumSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        float input = sc.nextInt();

        float numerator =1;
        float denominator ;
        float sum=0;

        for (denominator=0;denominator<=input;denominator++){

            if(denominator>0){

                System.out.println(numerator+"/"+denominator+" +");
                sum=sum+(numerator/denominator);

            }
        }
        System.out.println("The sum of the given series is "+sum);
}
}
