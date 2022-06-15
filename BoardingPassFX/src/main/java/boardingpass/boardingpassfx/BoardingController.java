package boardingpass.boardingpassfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class BoardingController implements Initializable{
    @FXML
    private TextField name;
    @FXML
    private TextField email;
    @FXML
    private TextField phoneNumber;
    @FXML
    private ComboBox<String> gender;
    @FXML
    private TextField age;
    @FXML
    private DatePicker date;
    private String flightDate;
    @FXML
    private ComboBox<String> origin;
    @FXML
    private ComboBox<String> destination;
    @FXML
    private ComboBox<String> flightClass;
    @FXML
    private ComboBox<Seat> seatPicker;
    @FXML
    private Label errorLabel;
    private String errorMessage;

    public void getDate(ActionEvent event) {
        LocalDate passengerDate = date.getValue();
        flightDate = passengerDate.toString();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> genders = FXCollections.observableArrayList("Male", "Female", "Other");
        gender.setItems(genders);

        ObservableList<String> cities = FXCollections.observableArrayList("Los Angeles", "San Francisco",
                "Portland", "Seattle", "Denver", "Houston", "Dallas",
                "Atlanta", "Orlando", "Miami", "New York City");
        origin.setItems(cities);
        destination.setItems(cities);

        ObservableList<String> seatClass = FXCollections.observableArrayList("Business", "Economy");
        flightClass.setItems(seatClass);

        ObservableList<Seat> seatChoice = FXCollections.observableArrayList(Seat.values());
        seatPicker.setItems(seatChoice);
    }

    public void book(ActionEvent e) throws IOException {
        BoardingPass boardingPass = new BoardingPass(name.getText(), email.getText(), phoneNumber.getText(),
                gender.getSelectionModel().getSelectedItem().toString(), age.getText(), flightDate,
                origin.getSelectionModel().getSelectedItem().toString(), destination.getSelectionModel().getSelectedItem().toString(),
                flightClass.getSelectionModel().getSelectedItem().toString(), seatPicker.getSelectionModel().getSelectedItem().toString());
        boardingPass.generatePass();
        boardingPass.writeImage();
        System.exit(0);
    }

}