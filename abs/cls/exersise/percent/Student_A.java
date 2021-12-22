package abs.cls.exersise.percent;

public class Student_A extends  Marks{

    double Sub1;
    double Sub2;
    double Sub3;

    public Student_A(double Sub1,double Sub2,double Sub3){

        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
    }

    @Override
    public double getPercentage() {

    double totalMArks = Sub1+Sub2+Sub3;
    double Percentage = (totalMArks/300)*100;

    return Percentage;
    }

}

