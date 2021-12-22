package com.classobject.homework;

import java.util.Scanner;

public class AreaRectangleExecute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaRectangle Area = new AreaRectangle();

        System.out.println("Enter length and breadth of rectangle");
        Area.length= sc.nextInt();
        Area.breadth=sc.nextInt();

        Area.setDim(Area.length,Area.breadth);
        System.out.println(Area.getArea());


    }
}
