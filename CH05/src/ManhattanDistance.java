
public class ManhattanDistance
{
  public static int manhattanDist(int x1, int y1, int x2, int y2)
  {
    return Math.abs(x2 - x1) + Math.abs(y2 - y1);
  }

  public static void main(String[] args)
  {
    int x1 = 0;
    int y1 = 0;
    int x2 = 3;
    int y2 = 4;
    System.out.println(manhattanDist(x1, y1, x2, y2)); // 7
  }

}