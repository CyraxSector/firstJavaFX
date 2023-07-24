package com.example.firstjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    public Button loginText;
    @FXML
    public MenuItem closeButton;
    @FXML
    public MenuItem editButton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        loginText.setText("Enter!");
        welcomeText.setText("Welcome to Hello JavaFX Application!");
    }

    @FXML
    public void onLoginButtonClick(ActionEvent e) throws IOException {
        welcomeText.setText("Log into JavaFX Application!");
        Stage previousStage = (Stage)editButton.getParentPopup().getOwnerWindow();
//        Stage previousStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample-ui.fxml")));
        previousStage.setScene(new Scene(root, 600, 400));
    }

    @FXML
    public void onCloseMenuClick(ActionEvent actionEvent) {
        System.exit(0);
    }
}