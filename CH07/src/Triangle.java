/**
 * Create a method that draws a triangle using "*" symbols with a specific
 * number of rows
 * 
 * @author jason
 *
 */
public class Triangle
{

  public static void printTriangle(int rows)
  {
    for (int i = 1; i <= rows; i++)
    {
      for (int j = 1; j <= i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args)
  {
    printTriangle(5);

  }

}
