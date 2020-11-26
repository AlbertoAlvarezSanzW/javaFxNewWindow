package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class Controller {

    @FXML
    Label labelNumsAleatorios;
    @FXML
    TextField textNumUser;
    @FXML
    Button buttonUser;
    @FXML
    Stage stage;
    Parent root;
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
                System.out.println("EPIX FAIL");
                break;
            }
        }

    }

    public void onClickButtonUser() {
        try {
            stage = (Stage) buttonUser.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("newWindow.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
        stage.show();
    }

}
