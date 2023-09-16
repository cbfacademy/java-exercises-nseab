package com.cbfacademy.shapes;

public abstract class PaintShapes extends Shape {

    public static void main(String[] args) {
      Rectangle deck = new Rectangle(35, 20);
    Sphere ball = new Sphere(15);
    Cylinder tank = new Cylinder(10, 30);
 
    deck.amount(deck);
    ball.amount(ball);
    tank.amount(tank);
    }

}
    