package org.example.rockpaperscissorsjava;

public class rpsValues

{
  String Rock = "Rock";
  String Paper = "Paper";
  String Scissors = "Scissors";

  public rpsValues()
  {
    setRock("Rock");
    setPaper("Paper");
    setScissors("Scissors");
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
