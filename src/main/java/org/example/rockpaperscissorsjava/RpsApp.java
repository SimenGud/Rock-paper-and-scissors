package org.example.rockpaperscissorsjava;

import java.util.Scanner;

public class RpsApp {
  Scanner scanner = new Scanner(System.in);
  RpsValues RpsValues = new RpsValues();
  String computerChoice;

  String victory = "You win!";
  String defeat = "Computer wins!";
  String tie = "It's a tie!";

  public void run() {
    System.out.println("Welcome to Rock, Paper, Scissors!");
    System.out.println("Please enter your choice: Rock, Paper, or Scissors");
    String userChoice = scanner.nextLine();
    computerThrow();
    System.out.println("Computer choice: " + computerChoice);
    String result = determineWinner(userChoice, computerChoice);
    System.out.println(result);
    System.out.println("Want to play again? (Y/N)");
    String playAgain = scanner.nextLine();
    if (playAgain.equals("Y")) {
      run();
    } else {
      System.out.println("Thanks for playing!");
    }
  }

  private String determineWinner(String userChoice, String computerChoice) {
    if (userChoice.equals(computerChoice)) {
      return tie;
    } else if (
        userChoice.equals("Rock") && computerChoice.equals("Scissors") ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
      return victory;
    } else {
      return defeat;
    }
  }

  private String computerThrow() {
    if (RpsValues.generateComputerChoice().equals("Rock")) {
      computerChoice = "Rock";
    } else if (RpsValues.generateComputerChoice().equals("Paper")) {
      computerChoice = "Paper";
    } else {
      computerChoice = "Scissors";
    }
    return computerChoice;
  }
}
