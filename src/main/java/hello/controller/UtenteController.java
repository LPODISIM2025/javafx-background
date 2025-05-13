package hello.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UtenteController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField nomeText;
    @FXML
    private TextField passwordText;

    public UtenteController() {
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        nomeText.setText("Ciao");
        passwordText.setText("Juri");
        // nomeText.textProperty().addListener((obs, oldValue, newValue) -> {
        //     passwordText.setText(newValue);
        // });
		passwordText.textProperty().bind(nomeText.textProperty());
		

        loginButton.setOnAction(event -> {
			// if("juri".equals(nomeText.getText()) && "password".equals(passwordText.getText()))
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("secondScene.fxml"));
				Parent root = loader.load();
				Stage stage = (Stage) loginButton.getScene().getWindow();
				stage.setScene(new Scene(root));
			} catch (IOException e) {
				e.printStackTrace();
			}

        });
    }
	
}