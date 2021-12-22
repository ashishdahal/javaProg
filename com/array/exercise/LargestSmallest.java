package com.array.exercise;

import java.util.Stack;

public class LargestSmallest {

    public static void even(int[] x) {

        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] % 2 == 0) {
                s.push(x[i]);
            }
        }
        System.out.println(s);
    }

    public static void odd(int[] x) {

        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] % 2 == 1 || x[i] % 2 == -1) {
                s.push(x[i]);
            }
        }
        System.out.println(s);
    }

    public static void prime(int[] x) {

        int num = 0;
        String primeNumbers = "";
        int sum = 0;
        for (int i = 0; i <= x.length; i++)  /*change a.length to n*/ {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
                sum = sum + i;
            }
        }
        System.out.println("Prime numbers from given array :");
        System.out.println(primeNumbers);
        System.out.println("The sum of all prime numbers is: " + sum);
    }

    public static void negative(int[] x) {

        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] < 0) {
                s.push(x[i]);
            }
        }
        System.out.println(s);
    }

    public static void div5(int[] x) {

        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] % 5 == 0) {
                s.push(x[i]);
            }
        }
        System.out.println(s);
    }

    public static void LargestElement(int[] x) {


        int temporary;
        for (int i = 0; i <= x.length; i++) {

            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    temporary = x[i];
                    x[i] = x[j];
                    x[j] = temporary;
                }
            }
        }
        System.out.println("The largest element is:: " + x[x.length - 1]);
        System.out.println("The second largest element is:: " + x[x.length - 2]);

    }

    public static void sum(int[] x) {

        int sum = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            sum = sum + x[i];
        }
        System.out.println("The sum of all elements is " + sum);
    }


    public static void main(String[] args) {

        int[] intArray = new int[20];

        intArray = new int[]{1, 2, 3, 43, 5, -67, 843, -5, 6, 3, -4, 35, -75, 7, 85, 67, 9, 45, 76, 87, 100};

        // System.out.println(intArray[5]);

        //System.out.println("-------------");

        even(intArray);
        odd(intArray);
        prime(intArray);
        negative(intArray);
        div5(intArray);
        LargestElement(intArray);
        sum(intArray);


    }

}
