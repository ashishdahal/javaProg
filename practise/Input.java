package practise;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Input {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter your name");
        String name = bufferedReader.readLine();

        System.out.println("Enter age");
        int age = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter your height");
        int height = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter status");
        boolean status = Boolean.parseBoolean(bufferedReader.readLine());


        int marks[] = new int[5];
        int large;
        int sum=0;
        int average;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Marks for " + (i + 1) + " subject");
            marks[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int j = 0; j < marks.length; j++) {
            for (int k = j + 1; k < marks.length; k++) {
                if (marks[j] > marks[k]) {
                    large = marks[j];
                    marks[j]=marks[k];
                    marks[j]=large;
                }
        }
        }

        for(int i = 0; i<marks.length;i++){
        sum=sum+marks[i];
        }

        average=sum/marks.length;

        System.out.println("----------------------------------------------------");
        System.out.println("Your name " + name);
        System.out.println("Your age " + age);
        System.out.println("Your height " + height);
        System.out.println("Your status " + status);

        System.out.println("----------------------------------------------------");
        System.out.println("The smallest mark is "+marks[0]);
        System.out.println("The largest marks is:: " + marks[marks.length - 1]);
        System.out.println("The sum of marks "+sum);
        System.out.println("The average marks :"+ average);
        System.out.println("Marks in all subject " + Arrays.toString(marks));

    }
}
