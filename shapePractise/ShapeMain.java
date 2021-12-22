package shapePractise;

public class ShapeMain {
    public static void main(String[] args) {

        //set shape and display
        Shape shapeName = new Shape();
        shapeName.setShape("shape");
        shapeName.display();

        Circle circle = new Circle();
        circle.setShape("circular");
        circle.display();

        System.out.println("------------------------------");

        Rectangle1 Rect = new Rectangle1();
        Rect.setShape("Rectangular");
        Rect.display();

        System.out.println("------------------------------");

        Square sq = new Square();
        sq.setShape("Square");
        sq.display();


    }
}
