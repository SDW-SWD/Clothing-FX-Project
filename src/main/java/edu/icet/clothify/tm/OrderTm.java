package edu.icet.clothify.tm;

import edu.icet.clothify.db.DBConnection;
import javafx.fxml.Initializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderTm implements Initializable {
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
        generate_ID();
    }

    private void generate_ID() {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO Order VALUES(?,?.?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
