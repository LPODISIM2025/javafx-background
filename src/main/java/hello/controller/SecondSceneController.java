package hello.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class SecondSceneController implements Initializable {

    @FXML
    private Label label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText("Benvenuto nella seconda scena!");
    }
}