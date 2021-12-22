package com.conditional.exercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Subjects {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] marks = new int[5];

        for (int i=0;i<5;i++){

            System.out.println("Enter marks on Subject "+(i+1));
            int obtained = sc.nextInt();

            if (obtained>=0 && obtained<=100){
                marks[i]=obtained;
            }
            else{
                System.out.println("Invalid Marks");
                break;
            }


        }

        int sum = IntStream.of(marks).sum();
        System.out.println("The total score of the student is: "+sum);
        if (sum>300 && sum<350){
            System.out.println("The grade is D");
        }else if(sum>350 && sum<400){
            System.out.println("The grade is C");
        }else if(sum>400 && sum<450){
            System.out.println("The grade is B");
        }else if(sum>450 && sum<=500){
            System.out.println("The grade is A");
        }else{
            System.out.println("The grade is FAIL");
        }

    }
}
