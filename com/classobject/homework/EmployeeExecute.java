package com.classobject.homework;

public class EmployeeExecute {

    public static void main(String[] args) {

        Employee emp1 = new Employee("a","Robert",1994,50000,"Texas");
        Employee emp2 = new Employee("b","James",1955,50000,"Chicago");
        Employee emp3 = new Employee("c","Hero",1004,50000,"MSP_COUNTY");
        Employee emp4 = new Employee("d","Judy",2004,50000,"Riverdale");

        System.out.println("id   "+"name   "+"yearof join "+ " Address"+"  Salary");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }

}
