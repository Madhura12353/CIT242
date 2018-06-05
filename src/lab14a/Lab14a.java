/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 *
 * @author madhurakulkarni
 */
public class Lab14a extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        double paneWidth = 200;
        double paneHeight = 200;
        double width = paneWidth * 0.90 - 30;
        double height = paneHeight * 0.90 - 60;
        
        System.out.println("Width is: "+ width);
        System.out.println("Height is: "+ height);
        //Draw rectangle 
        Rectangle r1 = new Rectangle (10, 60, width, height);
        r1.setFill (new Color(1, 1, 1, 0));
        r1.setStroke(Color.BLACK);
        pane.getChildren().add(r1);
//
        Rectangle r2 = new Rectangle (25, 40, width, height);
        r2.setFill (new Color(1, 1, 1, 0));
        r2.setStroke(Color.BLACK);
        pane.getChildren().add(r2);
//
//        
//        //Draw line 
//        
Line line = new Line(); 
line.setStartX(25); 
line.setStartY(40); 
line.setEndX(10); 
line.setEndY(60);
pane.getChildren().add(line);

Line line1 = new Line(); 
line1.setStartX(25+width); 
line1.setStartY(40); 
//line1.setEndX(160); 
line1.setEndX(10+width); 
line1.setEndY(60);
pane.getChildren().add(line1);

Line line2 = new Line(); 
line2.setStartX(25+width); 
line2.setStartY(40+height); 
line2.setEndX(10+width); 
line2.setEndY(60+height);
pane.getChildren().add(line2);


Line line3 = new Line(); 
line3.setStartX(25); 
line3.setStartY(width+10); 
line3.setEndX(10); 
line3.setEndY(60+height);
pane.getChildren().add(line3);
        
        Scene scene = new Scene (pane, paneWidth, paneHeight);
        primaryStage.setTitle("Lable14a");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
