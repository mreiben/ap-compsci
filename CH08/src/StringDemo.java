
public class StringDemo
{

  public static void main(String[] args)
  {
    String s = "home run";
    System.out.println(s.length());
    System.out.println(s.substring(0,4)); //prints "home"
    System.out.println(s.substring(2,4)); //prints "me"
    System.out.println(s.substring(5)); //prints "run"
    System.out.println(s.indexOf(" ")); //prints "4", the index position of the space in this string
    
    System.out.println("home".compareTo("run")); //"h" is alphabetically earlier, so this returns a negative
  }

}
