package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    Label labelNumsAleatorios;
    @FXML
    TextField textNumUser;
    @FXML
    Button buttonUser;
    public int vecesCorrecto = 0;
    Random generar = new Random();

    public void onChangeTextNumUser() {
        if (textNumUser.getText().equals(labelNumsAleatorios.getText())) {
            vecesCorrecto++;
            System.out.println(vecesCorrecto);
            labelNumsAleatorios.setText(String.valueOf(generar.nextInt(10)));
            textNumUser.setText("");
        }
        switch (vecesCorrecto) {
            case 1: {
                buttonUser.setVisible(true);
                break;
            }
            case 2: {
                buttonUser.setDisable(false);
                break;
            }
            default: {
                System.out.println("Pero que coño has hecho crack");
                break;
            }
        }

    }

    public void onClickButtonUser() {
        
    }

}
