package Presentation;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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
        Image imageFile = new Image("file:filmj5.jpg");
        ImageView image = new ImageView(imageFile);

        image.setRotate(180);
        image.setScaleX(0.5);
        image.setScaleY(0.5);

        image.setTranslateX(50);

        Pane frame = new Pane();
        frame.getChildren().add(image);

        window.setScene(new Scene(frame));
        window.show();

    }

}
