package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPainExample extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label jfxv = new Label("Hello, JavaFX " + javafxVersion);
		Label jv = new Label("running on Java " + javaVersion + ".");
		
		AnchorPane anchorPane = new AnchorPane(); 
		anchorPane.getChildren().add(jfxv);
		anchorPane.getChildren().add(jv);
		AnchorPane.setBottomAnchor(jv, 10.0);
		
		Scene scene = new Scene(anchorPane, 640, 480); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
