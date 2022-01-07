package Presentation;

import javafx.application.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import static javafx.application.Application.launch;

public class BeginScreen extends Application {

    @Override
    public void start(Stage window) {
        Image imageFile = new Image("file:Logo.jpg");
        ImageView image = new ImageView(imageFile);

        Pane frame = new Pane();
        frame.getChildren().add(image);

        window.setScene(new Scene(frame));
        window.show();

    }

}
