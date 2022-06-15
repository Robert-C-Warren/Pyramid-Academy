module boardingpass.boardingpassfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens boardingpass.boardingpassfx to javafx.fxml;
    exports boardingpass.boardingpassfx;
}