package com.cbfacademy.shapes;

public class PaintShapes extends Shape {
    protected Sphere sphere;
     Rectangle rectangle;
    protected Cylinder cylinder;

    public static void main(String[] args) {
        Sphere sphere= new Sphere(15);
        System.out.println(sphere.area());
    }
    // Sphere sphere= new Sphere(10);
        // Rectangle rectangle=new Rectangle(5,10);
        // Cylinder cylinder= new Cylinder(5, 2);
    //System.out.println(cylinder.area());
}
