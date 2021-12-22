package abs.cls.exersise;

public abstract class Parent {

    public abstract void message();

}

class FirstSub extends Parent{
    public void message(){
        System.out.println("This is first subclass");
    }
}

class SecondSub extends Parent{
    public void message(){
        System.out.println("This is second subclass");
    }
}
