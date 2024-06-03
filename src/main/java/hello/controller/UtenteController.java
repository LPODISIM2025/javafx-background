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
//		nomeText.textProperty().addListener(new ChangeListener<String>() {
//			@Override
//			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//				passwordText.setText(newValue);
//			}
//		});
		nomeText.textProperty().bindBidirectional(passwordText.textProperty());

	}
    @FXML
    void submit(ActionEvent event) {
    	System.out.println("Invocato");
    	if("juri".equals(nomeText.getText()) && "password".equals(passwordText.getText()))
    		System.out.println("LOGGATO");;
    }
}