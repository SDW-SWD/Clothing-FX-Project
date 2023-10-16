package edu.icet.clothify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Customer {
    String Customer_Name;
    String Customer_ID;
    String Customer_Address;
    String Customer_Email;
    String Customer_phone;
    String  Customer_nic;

}
