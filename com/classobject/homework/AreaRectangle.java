package com.classobject.homework;

public class AreaRectangle {

    int length;
    int breadth;


    public void setDim(int length, int breadth){

        this.length=length;
        this.breadth=breadth;

    }

    public int getArea(){
        return length*breadth;
    }

}
