package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorCalculator {

    public TextField txtone;
    public TextField txttwo;
    public Label lblAnswer;

    public void btnAdding(ActionEvent actionEvent) {
        int number1,number2;
        int answer=0;

        number1=Integer.parseInt(txtone.getText());
        number2=Integer.parseInt(txttwo.getText());
        answer=number1+number2;
        lblAnswer.setText(answer+"");
    }
}
