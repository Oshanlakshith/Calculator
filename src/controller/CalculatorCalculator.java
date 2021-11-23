package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorCalculator {

    public TextField txtone;
    public TextField txttwo;
    public Label lblAnswer;

    int number1,number2;
    int answer=0;

    public void btnAdding(ActionEvent actionEvent) {
        number1=Integer.parseInt(txtone.getText());
        number2=Integer.parseInt(txttwo.getText());

        answer=number1+number2;
        lblAnswer.setText(answer+"");
    }

    public void btnMiness(ActionEvent actionEvent) {
        number1=Integer.parseInt(txtone.getText());
        number2=Integer.parseInt(txttwo.getText());

        answer=number1-number2;
        lblAnswer.setText(answer+"");
    }

    public void btnIncrease(ActionEvent actionEvent) {
        number1=Integer.parseInt(txtone.getText());
        number2=Integer.parseInt(txttwo.getText());

        answer=number1*number2;
        lblAnswer.setText(answer+"");
    }

    public void btmdivide(ActionEvent actionEvent) {
        number1=Integer.parseInt(txtone.getText());
        number2=Integer.parseInt(txttwo.getText());

        answer=number1/number2;
        lblAnswer.setText(answer+"");
    }
}
