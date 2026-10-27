import java.util.Scanner;
import com.ioc.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;


public class Main{



  public static void main(String[] args){

    ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
//    Shape square = container.getBean("rectangleShape", Shape.class);
    Shape circle = container.getBean("circleShape", Shape.class);

//    Scanner scanner = new Scanner(System.in);

//    System.out.print("Enter width: ");
//    double width = scanner.nextDouble();
//
//    System.out.print("Enter height: ");
//    double height = scanner.nextDouble();

//    double area = square.getArea(width , height);
//    System.out.println("area = " + area);

//    System.out.print("Enter radius: ");
//    double radius = scanner.nextDouble();
//
//    double area = circle.getArea(radius , 0);
//        System.out.println("area = " + area);

    circle.draw();
//
    Shape square = container.getBean("squareShape", Shape.class);
    square.draw();

    Shape rectangle = container.getBean("rectangleShape", Shape.class);
    rectangle.draw();


    ((ClassPathXmlApplicationContext) container).close();


  }

}
