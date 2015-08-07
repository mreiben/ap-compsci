
public class PetTest
{

  public static void main(String[] args)
  {
    Cat c1 = new Cat("Fred");
    Cat c2 = new Cat("Mittens");
    Dog d1 = new Dog("Fido");
    Dog d2 = new Dog("Guthrie");
    LoudDog d3 = new LoudDog("Max");
    
    Pet[] pets = {c1, c2, d1, d2, d3};
    
    for (Pet p : pets)
    {
      System.out.println(p.getName() + " says: " + p.speak());
    }
  }
}