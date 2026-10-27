package com.ioc;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component

public class SquareShape implements Shape {
  private DrawShape drawShape;
  final String shapeName ="square";

  @Autowired
  public SquareShape(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  @Override
  public String getShapeName() {
    return shapeName;
  }

  public void draw(){
   drawShape.draw(this);
 }
  public double getArea(double width , double height){
    return width * height;
 }

}
