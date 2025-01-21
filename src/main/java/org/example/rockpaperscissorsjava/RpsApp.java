package org.example.rockpaperscissorsjava;

import java.util.Scanner;

import org.example.rockpaperscissorsjava.RpsValues;

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
    if (RpsValues.generateComputerChoice() == "Rock") {
      computerChoice = "Rock";
    } else if (RpsValues.generateComputerChoice() == "Paper") {
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
      return tie;
    } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
      return victory;
    } else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
      return victory;
    } else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
      return victory;
    } else {
      return defeat;
    }
  }
}
