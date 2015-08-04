
public class TestDie
{

  public static void main(String[] args)
  {
    Die sixer = new Die();
    Die niner = new Die(9);
    
    for (int i=0; i<20; i++){
      System.out.println("Sixer roll: " + sixer.roll());
      System.out.println("Niner roll: " + niner.roll());
    }


  }

}
