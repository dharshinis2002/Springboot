package com.Laptop.laptop.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class LaptopDTO {
    public String model;
    private  int id;
    private  int gb;
    private  int quantity;
}
