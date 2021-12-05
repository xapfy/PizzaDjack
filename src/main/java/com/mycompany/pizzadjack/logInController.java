package com.mycompany.pizzadjack;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class logInController {

    @FXML
    private Button exitLogIn;

    @FXML
    void exit1(MouseEvent event) throws IOException {
        App.setRoot("sample");

    }
}



