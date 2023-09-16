package com.cbfacademy.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.shapeName = "Rectangle";
        this.coverage = 2;

    }
    
    public double area(){
        return length*width;
    }
}
