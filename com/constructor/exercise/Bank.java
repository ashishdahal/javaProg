package com.constructor.exercise;

public class Bank {

    private Long id;
    private String bankName;
    private Double baseInterestRate;
    private int numberOfBranch;
    private String headOfficeAddress;
    private String bankCategory;

    public Bank(Long id, String bankName, Double baseInterestRate, int numberOfBranch, String headOfficeAddress, String bankCategory){

        this.id=id;
        this.bankName=bankName;
        this.baseInterestRate=baseInterestRate;
        this.numberOfBranch=numberOfBranch;
        this.headOfficeAddress=headOfficeAddress;
        this.bankCategory=bankCategory;

    }

    public Bank(long id, String himalayan_bank, double baseInterestRate) {

    }


    public void display() {
        System.out.println("BANK ID :" + id);
        System.out.println("BANK NAME :" + bankName);
        System.out.println("BASE INTEREST RATE :" + baseInterestRate);
        System.out.println("NUMBER OF BRANCHES :" + numberOfBranch);
        System.out.println("HEAD OFFICE ADDRESS :" + headOfficeAddress);
        System.out.println("BANK CATEGORY :" + bankCategory + " Category");
    }


}
