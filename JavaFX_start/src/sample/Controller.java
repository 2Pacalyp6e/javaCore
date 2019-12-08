package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.geometry.Insets;


import java.util.LinkedList;


public class Controller{
    @FXML
    VBox vBox;
    @FXML
    HBox hBox;
    @FXML
    TextArea area;
    @FXML
    TextField textField;

    GridPane pane = new GridPane();

    public void setPane() {
        pane.setPrefSize(300, 300);
    }



    Button msg = new Button("");


    public void sendMsg() {
        area.appendText("- " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
