
public class Cylinder
{
  private Circle base;
  private int height;
  
  public Cylinder(int r, int h)
  {
    base = new Circle(r);
    height = h;
  }
  
  public double getVolume()
  {
    return height*base.getArea();
  }
  
}
