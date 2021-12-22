package splitwise_exercise;

import java.util.Scanner;



public class SplitMoney {

    int total;
    String name;
    int spent;
    int each;
    int totalFinal;


    public SplitMoney(String name, int spent,int total){
        this.name=name;
        this.spent=spent;
        this.totalFinal=0;
        this.total=total;
        this.each=this.total/4;

    }

    public int cal(){

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int vault=0;

        if(spent>each) {
            int spareAmount= spent-each;
            sum=sum+spareAmount;
            System.out.println("The user "+this.name+" still needs to get :"+sum);
        } else if(spent==each){
            System.out.println("The participant is clear");
        }else{
            int spareAmount=each-spent;
            sum=sum+spareAmount;
            vault=vault+sum;
            this.totalFinal=vault+this.totalFinal;
            System.out.println("The user "+this.name+" still needs to pay :"+sum+" to a groupVault");
            System.out.println("Total amount now to be balanced: "+this.totalFinal);
        }
        return totalFinal;

    }



    public void displayInfo(){

        System.out.println("The name : "+this.name+" How much Spent: "+ this.spent);
    }

}
