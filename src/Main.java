import com.ioc.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  void main() {

    ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
//    Shape square = container.getBean("rectangle", Shape.class);
    Shape circle = container.getBean("circle", Shape.class);

    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter width: ");
//    double width = scanner.nextDouble();
//
//    System.out.print("Enter height: ");
//    double height = scanner.nextDouble();
//
//    double area = square.getArea(width , height);
//    System.out.println("area = " + area);

//    System.out.print("Enter radius: ");
//    double radius = scanner.nextDouble();
//
//    double area = circle.getArea(radius , 0);
//        System.out.println("area = " + area);

    circle.draw();
//
//    Shape square = container.getBean("square", Shape.class);
//    square.draw();
//
//    Shape rectangle = container.getBean("rectangle", Shape.class);
//    square.draw();


    ((ClassPathXmlApplicationContext)container).close();


  }

