
public class TwoDArray
{

  public static void main(String[] args)
  {
    double [][] b = {{0.0, 0.1, 0.2}, {1.0, 1.1, 1.2}}; //double[][] -- the first '[]' is rows, second is columns
    
    
    System.out.println("Number of rows in b: " + b.length);
    System.out.println("Number of columns in b: " + b[0].length);
    
    //display row 0 of the array b
    for (double num : b[1])
      System.out.print(num + "  ");
      System.out.println();
    
    //display the elements of an individual column
    
    System.out.println();
      
    //display the full array
    for (int r = 0; r < b.length; r++) // for-each: for (double[] row : b)
    {
      for (int c = 0; c < b[r].length; c++)         // for (double elem : row)
      {
        System.out.print(b[r][c] + "  ");           //    System.out.print(elem + "  ");
      }
      System.out.println();
    }
    
    // find the sum of the elements
    double sum = 0.0;
    for (double[] row : b)
    {
      for (double elem : row)
      {
        sum += elem;
      }
    }
    System.out.println("Sum of all elements is: " + sum);
    
    //

  }

}
