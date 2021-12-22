package inheritance;

public class ParentClassMain {

    public static void main(String[] args) {


        ParentClass pc = new ParentClass("This is parent class");
        System.out.println("Object of Parent Class by Method of parent class");
        pc.displayP();
        System.out.println("---------------------");

        System.out.println("Object of Child Class by Method of Child class");
        ChildClass ch = new ChildClass("This is child class");
        ch.displayC();
        System.out.println("--------------------------");

        System.out.println("Method of Parent Class by Object of child class");
        ch.displayP();



    }

}
