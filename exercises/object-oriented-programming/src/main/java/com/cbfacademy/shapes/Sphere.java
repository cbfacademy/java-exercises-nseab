package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;
    public Sphere(double newRadius){
        this.radius = newRadius;
         this.shapeName = "Sphere";
    }
    
    public double area(){
        return 4*Math.PI*Math.pow(radius,2);
    }

}
