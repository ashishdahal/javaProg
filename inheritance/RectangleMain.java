package inheritance;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle Rect = new Rectangle(1,2);
        Rect.Area();
        Rect.Perimeter();

        Square Sq = new Square(1);
        Sq.Area();
        Sq.Perimeter();

    }
}
