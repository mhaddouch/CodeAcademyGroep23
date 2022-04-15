package Presentation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BeginScreen extends Application {
    
    @Override
    public void start(Stage window) throws FileNotFoundException{
        window.setTitle("Codecademy");

        Label user = new Label("Username:");
        Label pass = new Label("Password:");
        Label error = new Label("");

        TextField text = new TextField();
        text.setAlignment(Pos.CENTER);
        text.maxWidth(20);
        text.prefWidth(20);
        PasswordField text2 = new PasswordField();
        text2.setAlignment(Pos.CENTER);

        Button login = new Button("Login");
        Button back2 = new Button("Log uit");
        Button enter = new Button("Welkom");
        Button back = new Button("Terug");
        Button student = new Button("Student");
        Button registration = new Button("Registration");
        Button certificate = new Button("Certificate");
        Button course = new Button("Course");

        FileInputStream input = new FileInputStream("CodeAcedemyCode\\src\\Presentation\\Logo.jpg");
        Image home = new Image(input);
        ImageView afbeelding = new ImageView(home);
        afbeelding.prefWidth(400);
        afbeelding.prefHeight(400);

        HBox logter = new HBox(back, login);
        HBox n = new HBox(student, registration);
        HBox q = new HBox(course, certificate);
        VBox keuze = new VBox(n, q, back2);
        VBox log = new VBox(user, text, pass, text2, logter, error);
        VBox start = new VBox(afbeelding, enter);

        n.setSpacing(90);
        n.setAlignment(Pos.CENTER);
        q.setSpacing(100);
        q.setAlignment(Pos.CENTER);
        log.setSpacing(10);
        log.setAlignment(Pos.TOP_CENTER);
        keuze.setSpacing(100);
        keuze.setAlignment(Pos.TOP_CENTER);
        keuze.setPadding(new Insets(20));
        start.setSpacing(10);
        start.setAlignment(Pos.TOP_CENTER);
        logter.setAlignment(Pos.CENTER);
        logter.setSpacing(10);

        Scene begin = new Scene(start);
        Scene logscreen = new Scene(log);
        Scene menu = new Scene(keuze);

        login.setOnAction(value->{
            if(text.getText().equals("123")&&text2.getText().equals("abc")){
                window.setScene(menu);
                window.setWidth(400);
                window.setHeight(400);
                window.setX(800);
                window.setY(250);
            }else{
                error.setText("Verkeerde username of password");
            }
        });
        back2.setOnAction(value-> {
            window.setScene(logscreen);
            window.setWidth(250);
            window.setHeight(250);
            text.setText("");
            text2.setText("");
            window.setX(825);
            window.setY(300);
        });
        enter.setOnAction(value->{
            window.setScene(logscreen);
            window.setWidth(250);
            window.setHeight(250);
            window.setX(825);
            window.setY(300);
        });
        back.setOnAction(value->{
            window.setScene(begin);
            window.setWidth(1100);
            window.setHeight(800);
            window.setX(425);
            window.setY(100);
        });

        window.setScene(begin);
        window.setWidth(1100);
        window.setHeight(800);
        window.show();
    }
    public static void main(String[] args) {
        launch(BeginScreen.class);
    }
}
