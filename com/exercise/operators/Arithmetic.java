package com.exercise.operators;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();


        if (x<=0 || y<=0){
            System.out.println("Invalid Numbers");
        }
        else{
            System.out.println("The result of addition of "+x+","+y+" is :"+(x+y));
            System.out.println("The result of multiplication of "+x+","+y+" is :"+(x*y));
            System.out.println("The result of division of "+x+" by "+y+" is :"+(x/y));
            System.out.println("The result of subtraction of "+x+" from "+y+" is :"+(y-x));
            System.out.println("The remainder of division of "+x+" by "+y+" is :"+(x%y));
        }

    }


}





