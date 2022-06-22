module com.example.pickarestaurant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pickarestaurant to javafx.fxml;
    exports com.example.pickarestaurant;
}