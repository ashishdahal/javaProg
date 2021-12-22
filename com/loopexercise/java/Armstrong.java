package com.loopexercise.java;

public class Armstrong {

    public static void main(String[] args) {



        for (int i = 1; i<500; ++i) {
            int digits = 0;
            int result = 0;
            int originalNumber = i;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = i;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == i && result>100) {
                System.out.print(i + " ");
            }
        }
    }

}
