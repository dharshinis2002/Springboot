package com.Laptop.laptop.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int id;
    @Column(name = "model")
    private  String model;
    @Column(name = "price")
    private int price;
    @Column(name = "gb")
    private  int gb;
    @Column(name = "quantity")
    private  int quantity;
}
