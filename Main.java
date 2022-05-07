package com.example.lab1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        Rectangle r = new Rectangle(50, 50, 230, 180); // creating figure
        root.getChildren().add(r); // adding figure to root container
        r.setFill(Color.rgb(128,0,0)); // setting color of Bricks
        scene.setFill(Color.rgb(128,128,1)); // setting Color of Background

        Line l = new Line(50, 110, 280, 110);
        Line l2 = new Line(50, 170, 280, 170);
        Line l3 = new Line(160, 110, 160, 50);
        Line l4 = new Line(225, 170, 225, 110);
        Line l5 = new Line(100, 170, 100, 110);
        Line l6 = new Line(160, 230, 160, 170);

        root.getChildren().add(l);
        root.getChildren().add(l2);
        root.getChildren().add(l3);
        root.getChildren().add(l4);
        root.getChildren().add(l5);
        root.getChildren().add(l6);

        l.setStroke(Color.YELLOW);
        l2.setStroke(Color.YELLOW);
        l3.setStroke(Color.YELLOW);
        l4.setStroke(Color.YELLOW);
        l5.setStroke(Color.YELLOW);
        l6.setStroke(Color.YELLOW);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
