package abs.cls.exersise.analyze.abs;

public abstract class AbsParent {

    public AbsParent(){
        System.out.println("This is constructor of abstract class..");
    }

    public abstract void a_method();

    public void n_method(){
        System.out.println("This is non abstract method of a class");
    }


}
