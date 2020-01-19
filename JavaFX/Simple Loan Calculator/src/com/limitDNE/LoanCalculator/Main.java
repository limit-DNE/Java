package com.limitDNE.LoanCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("simple_loan_calculator.fxml"));
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(new Scene(root, 500, 600, Color.LIGHTBLUE));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
