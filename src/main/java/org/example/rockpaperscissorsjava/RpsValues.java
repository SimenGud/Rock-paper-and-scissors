package org.example.rockpaperscissorsjava;

import java.util.Random;

public class RpsValues {

  String Rock = "Rock";
  String Paper = "Paper";
  String Scissors = "Scissors";

  static Random random = new Random();

  public RpsValues()
  {
    setRock("Rock");
    setPaper("Paper");
    setScissors("Scissors");
  }

  public static String generateComputerChoice() {
    int randomNum = random.nextInt(3);
    if (randomNum == 0) {
      return "Rock";
    } else if (randomNum == 1) {
      return "Paper";
    } else {
      return "Scissors";
    }
  }

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
  }

}
