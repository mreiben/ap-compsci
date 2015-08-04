import java.util.Scanner;

/**
 * JM p.28
 * @author jason
 *
 */
public class Greetings2
{

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    
    System.out.print("Enter your first name: ");
    String firstName = kboard.nextLine();
    
    System.out.print("Enter your last name: ");
    String lastName = kboard.nextLine();
    
    System.out.print("How old are you? ");
    int age = kboard.nextInt(); //nextInt gets integer from keyboard input
    
    System.out.print("Name a real number: ");
    double num = kboard.nextDouble();
    
    System.out.println("\nHello, " + firstName + " " + lastName);
    System.out.println("Welcome to Java!");
    System.out.println("You can vote in " + (18-age) + " years!");
    System.out.println("Your real number was " + num);
    
    kboard.close();
  }
}