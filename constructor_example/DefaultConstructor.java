package constructor_example;

public class DefaultConstructor {

    /*DefaultConstructor(){
        System.out.println("This is Default constructor");
    }*/

    public void method()
    {
        System.out.println("Void method of the class");
    }
    public static void main(String args[]){

        DefaultConstructor obj = new DefaultConstructor();
        obj.method();
    }

}
