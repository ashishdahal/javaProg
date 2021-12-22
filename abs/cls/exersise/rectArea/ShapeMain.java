package abs.cls.exersise.rectArea;

public class ShapeMain {

    public static void main(String[] args) {

        System.out.println("-----------QUESTION 6________________");
        Area area = new Area();
        System.out.println("The Area of circle : "+area.CircleArea(14));
        System.out.println("The Area of Rectangle : "+area.RectangleArea(4,6));
        System.out.println("The Area of Square : "+area.SquareArea(14));

        System.out.println("------------Question 7-----------------");

        double RectArr[] = new double[5];
        double SqArr[] = new double[5];
        double CircArr[] = new double[5];

        for (int i = 0; i<5; i++){

            RectArr[i]= area.RectangleArea(i,i);
            SqArr[i]=area.SquareArea(i);
            CircArr[i]= area.CircleArea(i);

            System.out.println("---------------------ROUNDS--------------------");
            System.out.println("Area of rectangle "+(i+1)+" is "+RectArr[i]);
            System.out.println("Area of Square "+(i+1)+"  is "+SqArr[i]);
            System.out.println("Area of Circle "+(i+1)+"  is "+CircArr[i]);

        }
        }




    }


