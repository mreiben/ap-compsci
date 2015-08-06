/**
 * JM p.98 #8
 * 
 * @author jason
 *
 */
public class Circle
{
  //Static field (aka "class variable", all members of the class have this static value)
  private static int nextId = 1;
  
  //Instance variables: (aka non-static field, each member can have different values)
  private int radius;
  private int id;

  public Circle(int r)
  {
    radius = r;
    nextId++;
  }

  public int getRadius()
  {
    return radius;
  }

  public double getArea()
  {
    return (double) (radius * radius) * Math.PI;
  }

  public String toString() // this method is already part of the Object class
  {
    return "Circle: radius=" + radius + ", id=" + id;
  }
}
