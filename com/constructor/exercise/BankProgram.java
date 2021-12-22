package com.constructor.exercise;

public class BankProgram {

    public static void main(String[] args) {

        Bank bank1 = new Bank(2L,"GLOBAL BANK",20.00, 100, "Texas","A");
        Bank bank2 = new Bank(3l,"Himalayan Bank",30.00);
        bank1.display();
        bank2.display();


    }

}
