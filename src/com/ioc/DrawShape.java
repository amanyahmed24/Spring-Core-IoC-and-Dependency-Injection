package com.ioc;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component

public class DrawShape {
  private Shape shape;

  public void draw(Shape shape){
    System.out.println("drawing  " +shape.getShapeName() );
  }

}
