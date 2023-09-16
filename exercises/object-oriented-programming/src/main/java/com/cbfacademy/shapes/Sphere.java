package com.cbfacademy.shapes;

// A subclass Sphere that inherits from Shape and implements area
public class Sphere extends Shape {

    private double radius;

    // A constructor that sets the radius
    public Sphere(double radius){
        this.radius = radius;
         this.shapeName = "Sphere";
         this.coverage = Math.PI;
    }
    
    // An implementation of area that returns the area of the circle
    public double area(){
        return 4*Math.PI*Math.pow(radius,2);
    }

}
