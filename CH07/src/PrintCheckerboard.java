/**
 * JM text p. 204 # 21
 * @author jason
 *
 */
public class PrintCheckerboard
{

  public static void printCheckerboard(int n)
  {
    int row = 0;
    for (int i=1; i <= n; i++)
    {
      row +=1;
      if (row % 2 == 1)
      {
        for (int k = 1; k <= n; k++)
        {
          if (k % 2 == 1)
          {
            System.out.print("#");
          }
          else
          {
            System.out.print("o");
          }
        }
        System.out.println();
      }
      else
      {
        for (int k = 1; k <= n; k++)
        {
          if (k % 2 == 1)
          {
            System.out.print("#");
          }
          else
          {
            System.out.print("o");
          }
        }
        System.out.println();
      }
    }
  }
  public static void main(String[] args)
  {
    printCheckerboard(7);

  }

}
