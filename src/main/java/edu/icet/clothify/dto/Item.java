package edu.icet.clothify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Item {
    String Item_ID;
    String Item_Name;
    String Description;
    String  selling_price;
    String buying_price;
}
