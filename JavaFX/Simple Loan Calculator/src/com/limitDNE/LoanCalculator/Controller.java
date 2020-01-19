package com.limitDNE.LoanCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField annualInterestRateTextField;
    @FXML
    private TextField numberOfYearsTextField;
    @FXML
    private TextField loanAmountTextField;
    @FXML
    private Button calculateButton;
    @FXML
    private Text monthlyPaymentText;
    @FXML
    private Text monthlyPaymentResultText;
    @FXML
    private Text totalPaymentText;
    @FXML
    private Text totalPaymentResultText;
    @FXML
    private GridPane loanCalculatorGridPane;

    public void initialize(){
        loanCalculatorGridPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        monthlyPaymentText.setVisible(false);
        totalPaymentText.setVisible(false);
    }

    @FXML
    public void onCalculateClicked(ActionEvent actionEvent) {
        if (annualInterestRateTextField.getText() != null && !annualInterestRateTextField.getText().trim().isEmpty()
        && numberOfYearsTextField.getText() != null && !numberOfYearsTextField.getText().trim().isEmpty() && loanAmountTextField != null
        && !loanAmountTextField.getText().trim().isEmpty()){
            double interest = Double.parseDouble(annualInterestRateTextField.getText());
            int years = Integer.parseInt(numberOfYearsTextField.getText());
            double loanAmount = Double.parseDouble(loanAmountTextField.getText());
            Loan loan = new Loan(interest, years, loanAmount);
            monthlyPaymentText.setVisible(true);
            monthlyPaymentResultText.setText(String.format("$%.2f", loan.getMonthlyPayment()));
            totalPaymentText.setVisible(true);
            totalPaymentResultText.setText(String.format("$%.2f", loan.getTotalPayment()));
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in all the areas to calculate payment.");
            alert.show();
        }
    }
}
