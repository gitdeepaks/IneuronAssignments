package com.example.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textfieldOne;

    @FXML
    private Button captain;
    @FXML
    private Button ironman;

    @FXML
    private Button hulk;

    @FXML
    private Button thor;

    @FXML
    public void onButtonTapped(ActionEvent e) {
        if (e.getSource().equals(captain)){
            System.out.println("Captain was clicked by :  " + textfieldOne.getText());

        } else if (e.getSource().equals(hulk)){
            System.out.println("hulk was clicked by :  " + textfieldOne.getText());

        } else if (e.getSource().equals(thor)) {
            System.out.println("thor was clicked by :  " + textfieldOne.getText());

        } else if (e.getSource().equals(ironman)) {
            System.out.println("ironman was clicked by :  " + textfieldOne.getText());

        }

    }


    @FXML
    private Label welcomeText;

}