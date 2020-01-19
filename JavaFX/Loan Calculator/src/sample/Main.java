package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    private TextField annualInterestRateText = new TextField();
    private TextField numberOfYearsText = new TextField();
    private TextField loanAmountText = new TextField();
    private TextField monthlyPaymentText = new TextField();
    private TextField totalPaymentText = new TextField();
    private Button calculateButton = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(annualInterestRateText, 1, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(numberOfYearsText, 1, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(loanAmountText, 1, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(monthlyPaymentText, 1, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(totalPaymentText, 1, 4);
        gridPane.add(calculateButton, 1, 5);

        gridPane.setAlignment(Pos.CENTER);
        annualInterestRateText.setAlignment(Pos.CENTER_RIGHT);
        numberOfYearsText.setAlignment(Pos.CENTER_RIGHT);
        loanAmountText.setAlignment(Pos.CENTER_RIGHT);
        monthlyPaymentText.setAlignment(Pos.CENTER_RIGHT);
        totalPaymentText.setAlignment(Pos.CENTER_RIGHT);
        monthlyPaymentText.setEditable(false);
        totalPaymentText.setEditable(false);
        GridPane.setHalignment(calculateButton, HPos.RIGHT);
        gridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        calculateButton.setOnAction(e -> calculateLoanPayment());

        Scene scene = new Scene(gridPane, 600, 600);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateLoanPayment(){
        double interest = Double.parseDouble(annualInterestRateText.getText());
        int year = Integer.parseInt(numberOfYearsText.getText());
        double loanAmount = Double.parseDouble(loanAmountText.getText());
        Loan loan = new Loan(interest, year, loanAmount);
        monthlyPaymentText.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        totalPaymentText.setText(String.format("$%.2f", loan.getTotalPayment()));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
