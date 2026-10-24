package com.ioc;

public class RectangleShape implements Shape {

  private DrawShape drawShape;

  public RectangleShape(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  public void draw(){
    drawShape.draw("rectangle");
 }
  public double getArea(double width , double height){
    return width * height;
 }

}
