package com.exercise.operators;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Average {

    static float calAverage(int[] a) {

        float sum = IntStream.of(a).sum();
        float length = a.length;
        float average = sum/length;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many entries do you want to calculate average of?");
        float length = sc.nextInt();
        int [] numbers = new int [(int) length];

        int i=0;
        while(i<length){
            System.out.println("Enter numbers:");
            numbers[i]=sc.nextInt();
            i++;
         }
        float finalResult = calAverage(numbers);
        System.out.println("The average of given numbers is "+finalResult);
}
}
