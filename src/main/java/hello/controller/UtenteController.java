package hello.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UtenteController implements Initializable{

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
		nomeText.textProperty().addListener((obs, oldValue, newValue) ->{
			passwordText.setText(newValue);
			System.out.println("Nuovo valore: " + newValue);
			System.out.println("Vecchio valore: " + oldValue);
			System.out.println("Nuovo valore: " + passwordText.getText());
		});
		loginButton.setOnAction(event -> {
			System.out.println("Login button clicked");
			System.out.println("Nome: " + nomeText.getText());
			System.out.println("Password: " + passwordText.getText());
		});
		//nomeText.textProperty().bindBidirectional(passwordText.textProperty());

	}
	/// SE VOLETE USARE IL METODO RICORDARE DI CAMBIARE IL FILE FXML IN login.fxml E AGGIUNGERE IL METODO onClick NEL PULSANTE
    // @FXML
    // void submit(ActionEvent event) {
    // 	System.out.println("Invocato");
    // 	if("juri".equals(nomeText.getText()) && "password".equals(passwordText.getText()))
    // 		System.out.println("LOGGATO");;
    // }
}