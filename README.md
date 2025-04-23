# Virtual Pet Simulator

## Project Overview
The Virtual Pet Simulator is a console-based Java application designed for beginners to learn Object-Oriented Programming (OOP) concepts. In this game, users can adopt a virtual pet (either a dog or a cat), manage its needs (hunger, mood, health), and watch it evolve over time. The pet responds to actions like eating, sleeping, and playing, with stats that decay naturally over time. The project is built using pure Java, with no external frameworks or libraries, and is version-controlled using Git and hosted on GitHub.

This project was developed as a university assignment to demonstrate the application of 10 core OOP principles: Modularity, Hierarchy, Reuse, Encapsulation, Subtyping, Information Hiding, Abstraction, Inheritance, Polymorphism, and Exception Handling.

## Features
- Choose between a dog or cat as your virtual pet.
- Manage pet stats: hunger, mood, and health.
- Perform actions: feed, play, sleep, or check the pet’s status.
- Watch the pet evolve as it reaches certain age milestones.
- Console-based interaction with input validation and error handling.
- Persistent game loop until the user exits.

## Prerequisites
To run this project, you need the following installed on your system:
- **Java Development Kit (JDK)**: Version 17 or later.
- **Visual Studio Code (VS Code)**: With Java extensions installed.
- **Git**: For version control and pushing to GitHub.

## How to Install and Run
Follow these steps to set up and run the Virtual Pet Simulator:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/virtual-pet-simulator.git
   cd virtual-pet-simulator
   ```

2. **Open in VS Code**:
   - Launch VS Code.
   - Open the `virtual-pet-simulator` folder via `File > Open Folder`.

3. **Compile the Project**:
   - Ensure JDK is configured in VS Code.
   - Open the terminal in VS Code (`Terminal > New Terminal`).
   - Compile the project:
     ```bash
     javac -d bin src/com/virtualpet/*.java
     ```

4. **Run the Application**:
   - Execute the main class:
     ```bash
     java -cp bin com.virtualpet.Main
     ```
   - Alternatively, use VS Code’s "Run Java" button if the Java extension is configured.

5. **Interact with the Game**:
   - Follow the console prompts to:
     - Choose a pet type (dog or cat).
     - Name your pet.
     - Select actions (1: Feed, 2: Play, 3: Sleep, 4: Check Status, 5: Exit).
   - The pet’s stats will update, and it will evolve as it ages.

## Project Structure
```
VirtualPetSimulator/
├── src/
│   ├── Main.java
│   ├── Pet.java
│   ├── Dog.java
│   ├── Cat.java
│   └── PetSimulator.java
│   └── InvalidInputException.java  # Custom exception
├── .gitignore
└── README.md
```


## How to Use
- **Start the Game**: Run the application as described above.
- **Choose a Pet**: Select whether you want a dog or cat and give it a name.
- **Manage Your Pet**:
  - **Feed**: Reduces hunger but may affect mood or health.
  - **Play**: Improves mood but increases hunger.
  - **Sleep**: Restores health but may increase hunger.
  - **Bark/Meow**: Displays the sound in `Strings` 
  - **Exit**: Ends the game.
- **Evolution**: The pet evolves at age milestones (e.g., from puppy to adult dog).
- **Error Handling**: Invalid inputs (e.g., non-numeric choices) are caught and prompt the user to retry.


## Contributing
This is an academic project, so contributions are not expected. However, if you have suggestions or improvements, please create an issue on the GitHub repository.

## License
This project is for educational purposes only and is not licensed for commercial use.
