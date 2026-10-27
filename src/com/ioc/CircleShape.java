package com.ioc;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component

public class CircleShape  implements Shape {
  private DrawShape drawShape;
  private final String shapeName ="circle";

  @Autowired
  public CircleShape(DrawShape drawShape) {
    this.drawShape = drawShape;
  }

  public String getShapeName() {
    return shapeName;
  }

  public void draw(){
   drawShape.draw(this);
 }
  public double getArea(double radius ,   double n) {
    return radius * radius;
 }

}
