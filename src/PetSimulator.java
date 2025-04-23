import java.util.Scanner;

public class PetSimulator {
  private Pet pet;
  private Scanner scanner;

  public PetSimulator() {
    scanner = new Scanner(System.in);
    choosePet();
  }

  private void choosePet() {
    System.out.println("Choose your pet: 1 - Dog, 2 - Cat ( type 1 or 2)");
    int choice = getValidInput(1, 2);
    pet = (choice == 1) ? new Dog() : new Cat();
  }

  public void start(){
    while (pet.getHealth() > 0){
      pet.decayStats();
      displayMenu();
      int choice = getValidInput(1, 5);
      try {
        performAction(choice);
      } catch (InvalidActionException e) {
        System.out.println("Error: " + e.getMessage());
      }
      pet.displayStats();
      if (pet.getHealth() >= 90) pet.evolve();
    }
  }

  private void displayMenu(){
    System.out.println("\nWhat would you like to do?");
    System.out.println("1) Feed  2) Sleep  3) Play  4) Bark/Meow  5) Quit");
  }

  private void performAction(int choice) throws InvalidActionException{
    switch (choice) {
      case 1: pet.eat();break;
      case 2: pet.sleep();break;
      case 3: pet.play();break;
      case 4:
      if (pet instanceof Dog) ((Dog) pet).bark();
      else if (pet instanceof Cat) ((Cat) pet).meow();
      else throw new InvalidActionException("Pet can't do that!");
      case 5: pet.setHealth(0);break;
    
      default: throw new InvalidActionException("Invalid Choice!");
    }
  }

  private int getValidInput(int min, int max) {
    try {
      int input = Integer.parseInt(scanner.nextLine());
      if (input < min || input > max)
        throw new NumberFormatException();
      return input;
    } catch (NumberFormatException e) {
      System.out.println("Please enter a number between " + min + "and" + max + ":");
      return getValidInput(min, max);
    }
  }
}