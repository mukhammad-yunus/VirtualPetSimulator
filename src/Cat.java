public class Cat extends Pet{
  public Cat(){
    super();
  }

  @Override
  public void eat(){
    super.eat();
    System.out.println("Cat nibbles delicately.");
  }

  @Override
  public void evolve(){
    System.out.println("Cat becomes a majestic feline!");
    setMood(getMood() + 20);
  }
  public void meow(){
    System.out.println("Meow!");
  }
}