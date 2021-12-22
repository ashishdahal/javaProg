package shapePractise;

    class Shape {

        private String shape;

        //Getter

        public String getShape(){
            return shape;
        }

        //Setter
        public void setShape(String newShape){
            this.shape=newShape;
        }


        public void display() {

            System.out.println("This is : "+getShape());

        }
    }

    class Circle extends Shape{

        public Circle(){

        }

    }

    class Rectangle1 extends Shape {
        public Rectangle1(){

        }
    }

    class Square extends Rectangle1{
        public Square(){
            System.out.println("Square is a Rectangle");
        }
    }





