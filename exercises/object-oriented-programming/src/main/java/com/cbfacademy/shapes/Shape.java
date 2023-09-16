package com.cbfacademy.shapes;

//an abstract class shape
public abstract class Shape {

    protected String shapeName;
    protected double coverage;
    public void amount(Shape shape){
        System.out.println(shape.area()/coverage);
    }

    // an abstract method area
    public abstract double area();
    
        //throw new UnsupportedOperationException("Unimplemented method 'area'");
    

    public String toString(){
        return shapeName;
    }


    public String getShapeName() {
        return shapeName;
    }


    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

     
}
