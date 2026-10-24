package com.ioc;

public class SquareShape implements Shape {
  private DrawShape drawShape;

  public SquareShape(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  public void draw(){
   drawShape.draw("square");
 }
  public double getArea(double width , double height){
    return width * height;
 }

}
