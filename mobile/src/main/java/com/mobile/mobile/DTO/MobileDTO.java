package com.mobile.mobile.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MobileDTO {

    private String  productName;
    private int productPrice;
    private String productColour;
}
