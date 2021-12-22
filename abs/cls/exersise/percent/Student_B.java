package abs.cls.exersise.percent;

public class Student_B extends Marks {

    double Sub1;
    double Sub2;
    double Sub3;
    double Sub4;

    public Student_B(double Sub1, double Sub2, double Sub3,double Sub4) {

        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
        this.Sub4 = Sub4;
    }

    @Override
    public double getPercentage() {

        double totalMArks = Sub1 + Sub2 + Sub3 +Sub4;
        double Percentage = (totalMArks / 400) * 100;

        return Percentage;
    }

}
