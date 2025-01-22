package org.example.rockpaperscissorsjava;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RpsController {
  @FXML
  private Label resultLabel;

  private RpsMachine rpsMachine = new RpsMachine();

  @FXML
  protected void handleRock() {
    playGame("Rock");
  }

  @FXML
  protected void handlePaper() {
    playGame("Paper");
  }

  @FXML
  protected void handleScissors() {
    playGame("Scissors");
  }

  private void playGame(String userChoice) {
    String computerChoice = rpsMachine.generateComputerChoice();
    String result = rpsMachine.determineWinner(userChoice, computerChoice);
    resultLabel.setText("Computer choice: " + computerChoice + "\n" + result);
  }
}