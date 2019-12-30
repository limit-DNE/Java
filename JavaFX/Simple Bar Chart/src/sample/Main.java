package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Simple Bar Chart");
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
        barChart.setTitle("Grades Overview");
        xAxis.setLabel("Overall Grade");
        yAxis.setLabel("Value");
        yAxis.setAutoRanging(false);
        yAxis.setUpperBound(100);
        XYChart.Series series = new XYChart.Series();
        series.setName("2019");
        series.getData().add(new XYChart.Data("Projects", 16));
        series.getData().add(new XYChart.Data("Quiz", 7.6));
        series.getData().add(new XYChart.Data("Midterm", 23.4));
        series.getData().add(new XYChart.Data("Final", 28));
        series.getData().add(new XYChart.Data("Overall Grade", 75));
        Scene scene = new Scene(barChart, 700, 300);
        barChart.getData().addAll(series);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
