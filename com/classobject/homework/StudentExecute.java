package com.classobject.homework;

import java.util.Scanner;

public class StudentExecute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();

        student1.roll_no = 2;
        student1.name = "Sam";
        student1.phoneNum = 124424234;
        student1.address = "Texas";

        student2.roll_no = 3;
        student2.name = "John";
        student2.phoneNum = 004424234;
        student2.address = "TChicago";

        System.out.println(student1.roll_no+"  "+student1.name +"  "+ student1.phoneNum +"  "+ student1.address);
        System.out.println(student2.roll_no+"  "+student2.name +"  "+ student2.phoneNum +"  "+ student2.address);


    }
}
