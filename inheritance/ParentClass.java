package inheritance;

public class ParentClass {

    String message;

     public ParentClass(String message){

         this.message=message;
     }

    public void displayP(){
         System.out.println(message);
     }

}

class ChildClass extends ParentClass{

    public ChildClass(String message) {
        super(message);
    }
    public void displayC(){
      System.out.println(message);
  }


}
