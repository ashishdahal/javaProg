package inheritance;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){

        this.length=length;
        this.breadth=breadth;

    }

    public void Area(){
    int Area=length*breadth;
        System.out.println("Area is "+Area);
    }

    public void Perimeter(){
        int Perimeter = 2*(length+breadth);
        System.out.println("Perimeter is "+Perimeter);
    }

}

class Square extends Rectangle {
    public Square(int length) {
        super(length,length);
    }

}