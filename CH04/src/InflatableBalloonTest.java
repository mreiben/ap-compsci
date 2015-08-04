
public class InflatableBalloonTest
{

  public static void main(String[] args)
  {
    InflatableBalloon b1 = new InflatableBalloon();
    System.out.println("Original radius: " + b1.getRadius());
    b1.inflate(10);
    System.out.println("New radius: " + b1.getRadius());
    

  }

}
