package edu.icet.clothify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Supplier {
    String Supplier_ID;
    String Name;
    String Address;
    String email;
    String phone;
    String nic;
    String banke;
    String branch;

}
