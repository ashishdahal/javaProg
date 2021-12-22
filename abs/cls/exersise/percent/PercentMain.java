package abs.cls.exersise.percent;

import java.util.Scanner;

public class PercentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Student A");
        Student_A student_a = new Student_A(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("The std A percentage is "+student_a.getPercentage());

        System.out.println("---------------------------------");

        System.out.println("Enter marks for Student B");
        Student_B student_b = new Student_B(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),sc.nextDouble());
        System.out.println("The std A percentage is "+student_b.getPercentage());
    }
}
