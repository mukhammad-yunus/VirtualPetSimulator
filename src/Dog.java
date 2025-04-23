public class Dog extends Pet {
  public Dog(){
    super();
  }
  @Override
  public void eat(){
    super.eat();
    System.out.println("Dog gobbles up the kibble!");
  }

  @Override
  public void evolve(){
    System.out.println("Dog grows into a strong adult!");
    setHealth(getHealth() +20);
  }

  public void bark(){
    System.out.println("Woof Woof!");
    setMood(getMood() + 5);
  }
}