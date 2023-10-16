package edu.icet.clothify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
