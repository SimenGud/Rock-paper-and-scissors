package org.example.rockpaperscissorsjava;

import java.util.Random;
import java.util.Scanner;

import static org.example.rockpaperscissorsjava.RpsValues.generateComputerChoice;

public class RpsApp {
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();


  public void run() {
    System.out.println("Welcome to Rock, Paper, Scissors!");
    System.out.println("Please enter your choice: Rock, Paper, or Scissors");
    String userChoice = scanner.nextLine();
    String computerChoice = generateComputerChoice();
    if (generateComputerChoice() == "Rock") {
      computerChoice = "Rock";
    } else if (generateComputerChoice() == "Paper") {
      computerChoice = "Paper";
    } else {
      computerChoice = "Scissors";
    }
    System.out.println("Computer choice: " + computerChoice);
    String result = determineWinner(userChoice, computerChoice);
    System.out.println(result);
  }

  private String determineWinner(String userChoice, String computerChoice) {
    if (userChoice.equals(computerChoice)) {
      return "It's a tie!";
    } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
      return "You win!";
    } else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
      return "You win!";
    } else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
      return "You win!";
    } else {
      return "Computer wins!";
    }
  }
}
