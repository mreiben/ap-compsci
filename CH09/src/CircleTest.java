
public class CircleTest
{

  public static void main(String[] args)
  {
    Circle c1 = new Circle(2);
    Circle c2 = new Circle(100);
    Circle c3 = new Circle(5);
    Circle c4 = new Circle(9);
    Circle c5 = new Circle(20);
    
    Circle[] circles = {c1, c2, c3, c4, c5};
    
    for (Circle c : circles)
    {
      System.out.println(c);
    }

  }

}
