package edu.icet.clothify.tm;

import javafx.fxml.Initializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.net.URL;
import java.util.ResourceBundle;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerTm implements Initializable {
    String Customer_Name;
    String Customer_ID;
    String Customer_Address;
    String Customer_Email;
    String Customer_phone;
    String  Customer_nic;
    String Item_ID;
    String Item_Name;
    String SellingPrice;
    int QTY;
    String Size;
    double Profit;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        genarateID();
    }

    private void genarateID() {

    }
}
