package com.classobject.homework;

public class Employee {

    String id;
    String name;
    int year;
    int salary;
    String Address;

    public Employee(String id,String name,int year, int salary, String Address){

        this.id=id;
        this.name=name;
        this.year=year;
        this.Address=Address;
        this.salary=salary;

    }

    public void displayInfo(){
        System.out.println(id+"   "+name+"   "+year+"       "+Address+"      "+salary);
    }

}
