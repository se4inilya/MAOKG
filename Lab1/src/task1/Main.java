package task1;

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class Main extends Application {
       
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("lab1");
        
        Group root = new Group();
        Scene scene = new Scene(root, 700, 510);
        scene.setFill(Color.YELLOW);

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            100.0, 350.0,
            300.0, 425.0,
            450.0, 425.0, 
            600.0, 350.0,
            500.0, 500.0,
            250.0, 500.0});
        root.getChildren().add(polygon);
        polygon.setFill(Color.BROWN);
        
        Rectangle r = new Rectangle(365, 275, 20, 150);
        root.getChildren().add(r);
        r.setFill(Color.BLACK);
        
        Polygon polygon1 = new Polygon();
        polygon1.getPoints().addAll(new Double[]{
            325.0, 150.0,
            250.0, 250.0,
            300.0, 325.0, 
            450.0, 350.0,
            415.0, 250.0,
            440.0, 150.0});
        root.getChildren().add(polygon1);
        polygon1.setFill(Color.GREY);
   
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
