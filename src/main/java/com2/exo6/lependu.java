package com2.exo6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class lependu extends Application {

    private VBox root;

    private Label label;

    private int life = 7;

    private Button Rejouer;

    private Image image;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new VBox(5);
        root.setAlignment(Pos.CENTER);

        // Chargement de l'image
        Image image = new Image( lependu.class.getResource("pendu"+life+".png").toString() );

        // Création d'un composant avec l'image peinte à l'intérieur
        ImageView iv = new ImageView();
        iv.setImage(image);
        // Intégration de l'image
        root.getChildren().add( iv );
        VBox vbox = new VBox(iv);

        label = new Label();
        label.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        label.setText("Nombre de vies :" + life);
        root.setVgrow(label, Priority.ALWAYS);
        //root.setAlignment(label, Pos.CENTER);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello application");
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
