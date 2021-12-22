package com.exercise.operators;

import java.util.Scanner;

public class Areapm {

   static int[] Rectangle (int a, int b){
       int[] results = new int[2];
       results[0] = a*b;
       results[1] = 2*(a+b);
       return results;
   }

    static int[] Square (int a){
        int[] results = new int[2];
        results[0] = a*a;
        results[1] = 2*(a+a);
        return results;
    }

    static int[] Circle (int a){
        int[] results = new int[2];
        results[0] = (int) (Math.PI*a*a);
        results[1] = (int) (2*Math.PI*a);
        return results;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("For Rectangle Enter 1 : For Square Enter 2: For Circle Enter 3");
        int choice = sc.nextInt();

        if (choice==1){

        System.out.println("Enter length of rectangle.");
        int lengthRect = sc.nextInt();
        System.out.println("Enter breadth of rectangle.");
        int breadthRect = sc.nextInt();
        int[] results = Rectangle(lengthRect,breadthRect);
        System.out.println("The area of Rectangle is "+results[0]+" Perimeter is "+results[1]);

        }
        else if (choice==2){
            System.out.println("Enter length of square.");
            int lengthSquare = sc.nextInt();
            int[] results = Square(lengthSquare);
            System.out.println("The area of Square is "+results[0]+" Perimeter is "+results[1]);
        }
        else if (choice==3){
            System.out.println("Enter radius of circle.");
            int radiusCircle = sc.nextInt();
            int[] results = Circle(radiusCircle);
            System.out.println("The area of Square is "+results[0]+" Perimeter is "+results[1]);
        }



}
}