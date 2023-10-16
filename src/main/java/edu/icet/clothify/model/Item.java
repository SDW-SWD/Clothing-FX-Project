package edu.icet.clothify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    String Item_ID;
    String Name;
    String Description;
    String  selling_price;
    String buying_price;
}
