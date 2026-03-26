package JavaFx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class vinay_6_calculator extends Application {

    @Override
    public void start(Stage Primarystage) {

        // Create layout
         TextField t1 = new TextField();
         TextField t2 = new TextField();

        Label res = new Label("Result: ");

        t1.setPromptText("Enter the first number");
        t2.setPromptText("Enter the second number");

        t2.setPrefHeight(60);
        t2.setPrefWidth(60);

        t1.setPrefHeight(60);
        t1.setPrefWidth(60);

        Button add = new Button("Sum (+)");
        Button sub = new Button("Sub (-)");
        Button mul = new Button("Mul (*)");
        Button div = new Button("Div (/)");

        add.setPrefWidth(90);
        sub.setPrefWidth(90);
        mul.setPrefWidth(90);
        div.setPrefWidth(90);

        add.setPrefHeight(90);
        sub.setPrefHeight(90);
        mul.setPrefHeight(90);
        div.setPrefHeight(90);



        HBox btnbox = new HBox(10,add,sub,mul,div);
        VBox textbox = new VBox(20,t1,t2);
        add.setOnAction(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result " + (a+b));
        });

        sub.setOnAction(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result " + (a-b));
        });

        mul.setOnAction(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result " + a*b);
        });

        div.setOnAction(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result " + a/b);
        });

        VBox root= new VBox(10,textbox,btnbox,res);

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));




        Scene scene = new Scene(root, 350, 250);
        Primarystage.setScene(scene);
        Primarystage.setTitle("Simple Calculator");
        Primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}