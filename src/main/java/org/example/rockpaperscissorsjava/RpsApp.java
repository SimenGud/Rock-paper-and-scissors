package org.example.rockpaperscissorsjava;

import java.util.Scanner;

public class RpsApp {
  Scanner scanner = new Scanner(System.in);
  RpsMachine rpsMachine = new RpsMachine();

  public void run() {
    System.out.println("Welcome to Rock, Paper, Scissors!");
    System.out.println("Please enter your choice: Rock, Paper, or Scissors");
    String userChoice = scanner.nextLine();
    String computerChoice = rpsMachine.computerThrow();
    System.out.println("Computer choice: " + computerChoice);
    String result = rpsMachine.determineWinner(userChoice, computerChoice);
    System.out.println(result);
    System.out.println("Want to play again? (Y/N)");
    String playAgain = scanner.nextLine();
    if (playAgain.equals("Y")) {
      run();
    } else {
      System.out.println("Thanks for playing!");
    }
  }
}
