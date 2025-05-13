package hello;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.beans.binding.When;

public class StrokeBindingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text2 = new Text("Rotating Text");
        text2.setX(50);
        text2.setY(100);
        text2.setStyle("-fx-font-size: 24;");

        RotateTransition rotate = new RotateTransition(Duration.seconds(2), text2);
        rotate.setByAngle(360);
        rotate.setCycleCount(Animation.INDEFINITE);

        // Binding della proprietà stroke
        text2.strokeProperty().bind(new When(rotate.statusProperty()
                .isEqualTo(Animation.Status.RUNNING))
                .then(Color.GREEN)
                .otherwise(Color.RED));

        // Avvia l'animazione al clic
        text2.setOnMouseClicked(event -> {
            if (rotate.getStatus() == Animation.Status.RUNNING) {
                rotate.stop();
            } else {
                rotate.play();
            }
        });

        Scene scene = new Scene(new javafx.scene.Group(text2), 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stroke Binding Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}