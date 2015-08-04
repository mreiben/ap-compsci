import java.awt.Color;

/**
 * Represents an inflatable balloon. JM text p. 83
 * 
 * @author jason
 *
 */

public class InflatableBalloon extends Balloon //subclass inherits all public methods of super class
{
//  If class has no constructor, then java provides a no-args constructor
//  and the superclass must have a no-args constructor

  public void inflate(int percentage)
  {
    int newRadius= (int)((1 + percentage / 100.0) * getRadius() + 0.5);
    setRadius(newRadius);
  }
}
