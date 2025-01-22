module org.example.rockpaperscissorsjava {
  requires javafx.controls;
  requires javafx.fxml;

  opens org.example.rockpaperscissorsjava to javafx.fxml;
  exports org.example.rockpaperscissorsjava;
}