package edu.icet.clothify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    String Name;
    String Customer_ID;
    String Address;
    String Email;
    String phone;
    String  nic;

}
