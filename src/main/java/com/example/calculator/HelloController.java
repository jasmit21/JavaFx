package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField ans,num1,num2;

    @FXML
    protected void onaddButtonClick() {
        ans.setText("You clicked add!");
        double first = Double.parseDouble(num1.getText());
        double second = Double.parseDouble(num2.getText());
        double result = first + second;
        ans.setText(String.valueOf(result));
    }
    @FXML
    protected void onsubButtonClick() {
        ans.setText("You clicked sub!");
        double first = Double.parseDouble(num1.getText());
        double second = Double.parseDouble(num2.getText());
        double result = first - second;
        ans.setText(String.valueOf(result));
    }
}
