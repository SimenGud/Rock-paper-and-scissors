module org.example.rockpaperscissorsjava {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;

  opens org.example.rockpaperscissorsjava to javafx.fxml;
  exports org.example.rockpaperscissorsjava;
}