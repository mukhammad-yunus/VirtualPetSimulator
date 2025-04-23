public abstract class Pet{
  private int hunger;
  private int mood;
  private int health;

  public Pet() {
    this.hunger = 50;
    this.mood = 50;
    this.health = 50;
  }

  public int getHunger() {return hunger;}
  public int getMood() {return mood;}
  public int getHealth() {return health;}

  public void setHunger(int hunger){this.hunger = clamp(hunger);}
  public void setMood(int mood){this.mood = clamp(mood);}
  public void setHealth(int health){this.health = clamp(health);}

  private int clamp (int value){
    return Math.max(0, Math.min(100, value));
  }

  public void eat(){
    setHunger(getHunger() - 20);
    setHealth(getHealth() + 10);
    System.out.println("Pet eats some food.");
  }

  public void sleep(){
    setMood(getMood()+20);
    setHealth(getHealth()+10);
    setHunger(getHunger()+10);
    System.out.println("Pet takes a nap");
  }

  public void play(){
    setMood(getMood()+20);
    setHunger(getHunger()+15);
    setMood(getMood()+5);
    System.out.println("Pet plays happily.");
  }

  public abstract void evolve();

  public void decayStats(){
    setHunger(getHunger() +5);
    setMood(getMood()-5);
    setHealth(getHealth()-2);
  }

  public void displayStats(){
    System.out.println("Hunger: " + hunger + ", Mood: " + mood + ", Health: " + health);
  }
}