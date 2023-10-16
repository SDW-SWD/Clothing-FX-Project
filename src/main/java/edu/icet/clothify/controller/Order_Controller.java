package edu.icet.clothify.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.input.MouseEvent;

public class Order_Controller {

    @FXML
    private Label lblCusID;

    @FXML
    private JFXButton btnAddItem;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnRemove;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TreeTableColumn<?, ?> colCusContact;

    @FXML
    private TreeTableColumn<?, ?> colCusID;

    @FXML
    private TreeTableColumn<?, ?> colCusNIC;

    @FXML
    private TreeTableColumn<?, ?> colCusName;

    @FXML
    private TreeTableColumn<?, ?> colItemID;

    @FXML
    private TreeTableColumn<?, ?> colItemSize;

    @FXML
    private TreeTableColumn<?, ?> colItemprice;

    @FXML
    private TreeTableColumn<?, ?> colitemQTY;

    @FXML
    private TreeTableColumn<?, ?> colitemprofit;

    @FXML
    private TreeTableColumn<?, ?> colitemsell;

    @FXML
    private JFXRadioButton radiocard;

    @FXML
    private JFXRadioButton radiocash;

    @FXML
    private JFXTreeTableView<?> tblOrder;

    @FXML
    private JFXTextField txtCusID;

    @FXML
    private JFXTextField txtCusName;

    @FXML
    private JFXTextField txtCusNic;

    @FXML
    private JFXTextField txtCusaddress;

    @FXML
    private JFXTextField txtCusmail;

    @FXML
    private JFXTextField txtCusphone;

    @FXML
    private JFXTextField txtItID;

    @FXML
    private JFXTextField txtItName;

    @FXML
    private JFXTextField txtprofit;

    @FXML
    private JFXTextField txtqty;

    @FXML
    private JFXTextField txtsell;

    @FXML
    private JFXTextField txtsize;

    @FXML
    void OnClickAddItem(ActionEvent event) {

    }

    @FXML
    void OnClickButton(MouseEvent event) {

    }

    @FXML
    void OnClickClear(ActionEvent event) {

    }

    @FXML
    void OnClickRemove(ActionEvent event) {

    }

    @FXML
    void OnClickUpdate(ActionEvent event) {

    }

}
