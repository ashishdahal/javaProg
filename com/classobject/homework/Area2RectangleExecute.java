package com.classobject.homework;

import java.util.Scanner;

public class Area2RectangleExecute {

    public static void main(String[] args) {


        System.out.println("Enter length and breadth");

        Area2Rectangle Rect1 = new Area2Rectangle(4,5);
        Area2Rectangle Rect2 = new Area2Rectangle(5,8);


        System.out.println("Area: "+Rect2.getArea());
        System.out.println("Area: "+Rect1.getArea());

    }

}
