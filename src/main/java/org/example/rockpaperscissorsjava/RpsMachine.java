package org.example.rockpaperscissorsjava;

import java.util.Random;

public class RpsMachine {

  String Rock = "Rock";
  String Paper = "Paper";
  String Scissors = "Scissors";

  String victory = "You win!";
  String defeat = "Computer wins!";
  String tie = "It's a tie!";

  String computerChoice;

  static Random random = new Random();

  public String generateComputerChoice() {
    int randomNum = random.nextInt(3);
    if (randomNum == 0) {
      return Rock;
    } else if (randomNum == 1) {
      return Paper;
    } else {
      return Scissors;
    }
  }

  public String determineWinner(String userChoice, String computerChoice) {
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

  public String computerThrow() {
    if (generateComputerChoice().equals("Rock")) {
      computerChoice = "Rock";
    } else if (generateComputerChoice().equals("Paper")) {
      computerChoice = "Paper";
    } else {
      computerChoice = "Scissors";
    }
    return computerChoice;
  }

  /*
  public void setRock(String Rock)
  {
    if (Rock == null || Rock.isEmpty())
    {
      throw new IllegalArgumentException("Rock cannot be null or empty");
    }
    this.Rock = Rock;
  }

  public void setPaper(String Paper)
  {
    if (Paper == null || Paper.isEmpty())
    {
      throw new IllegalArgumentException("Paper cannot be null or empty");
    }
    this.Paper = Paper;
  }

  public void setScissors(String Scissors)
  {
    if (Scissors == null || Scissors.isEmpty())
    {
      throw new IllegalArgumentException("Scissors cannot be null or empty");
    }
    this.Scissors = Scissors;
  }

  public String getRock()
  {
    return Rock;
  }

  public String getPaper()
  {
    return Paper;
  }

  public String getScissors()
  {
    return Scissors;
  }*/

}
