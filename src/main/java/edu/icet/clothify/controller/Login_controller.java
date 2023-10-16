package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_controller {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Text login;

    @FXML
    void OnClickButton(ActionEvent event) {
        try {
            FXMLLoader lorder = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = lorder.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            ((Stage) btnLogin.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
