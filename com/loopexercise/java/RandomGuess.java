package com.loopexercise.java;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        int guess;

        do{
            System.out.println("Enter the num between 0-9 to guess");
            guess = sc.nextInt();
            System.out.println("Guessed Number:"+guess);
            if(guess>randomNumber){
                System.out.println("too high, TRY AGAIN");
            }else if(guess<randomNumber){
                System.out.println("too low,TRY AGAIN");
            }else{
                System.out.println("Congratulations you are right");
            }
        }
        while(guess != randomNumber);

    }

}
