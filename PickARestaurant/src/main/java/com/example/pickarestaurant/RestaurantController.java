package com.example.pickarestaurant;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class RestaurantController {
    public String restaurantMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Sevan Chicken");
        map.put(1, "Chipotle");
        map.put(2, "Sushi");
        map.put(3, "Thai Food");
        map.put(4, "Jersey Mikes");
        map.put(5, "McDonalds");
        map.put(6, "Taco Bell");
        map.put(7, "Protein Shake");
        map.put(8, "Wingstop");
        map.put(9, "Del Taco");
        map.put(10, "Pizza");
        map.put(11, "Tacos");
        map.put(12, "Carls Jr");
        map.put(13, "In'N'Out");
        map.put(14, "Everest");

        int key = ThreadLocalRandom.current().nextInt(0, 15);
        String location = map.get(key);

        return location;
    }
    @FXML
    private Label foodTime;

    @FXML
    protected void onButtonClick() {
        foodTime.setText(restaurantMap());
    }
}