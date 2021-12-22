package splitwise_exercise;

import java.util.Scanner;

public class SplitMoneyExecute {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total bill amount :");
        int total=sc.nextInt();
        sc.nextLine();


        System.out.println("Enter 1st person name and amount spent");
        SplitMoney Dis1 = new SplitMoney(sc.nextLine(), sc.nextInt(),total);
        sc.nextLine();
        System.out.println("Enter 2nd person name and amount spent");
        SplitMoney Dis2 = new SplitMoney(sc.nextLine(), sc.nextInt(),total);
        sc.nextLine();
        System.out.println("Enter 3rd person name and amount spent");
        SplitMoney Dis3 = new SplitMoney(sc.nextLine(), sc.nextInt(),total);
        sc.nextLine();
        System.out.println("Enter 4th person name and amount spent");
        SplitMoney Dis4 = new SplitMoney(sc.nextLine(), sc.nextInt(),total);

        System.out.println("-----------------------------------");
                Dis1.displayInfo();
                Dis2.displayInfo();
                Dis3.displayInfo();
                Dis4.displayInfo();
        System.out.println("----------------------------------");
                Dis1.cal();
                Dis2.cal();
                Dis3.cal();
                Dis4.cal();
        System.out.println("-------------------------------------");





        }

}

