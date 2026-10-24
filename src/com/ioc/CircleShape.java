package com.ioc;

public class CircleShape  implements Shape {
  private DrawShape drawShape;

  public CircleShape(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  public void draw(){
   drawShape.draw("circle");
 }
  public double getArea(double radius ,   double n) {
    return radius * radius;
 }

}
