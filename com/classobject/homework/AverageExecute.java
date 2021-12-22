package com.classobject.homework;

import java.util.Scanner;

public class AverageExecute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");

        Average av = new Average();

        System.out.println(av.calculateAverage(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));

    }

}
