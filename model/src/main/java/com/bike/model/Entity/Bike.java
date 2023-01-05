package com.bike.model.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "bikes")
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "bike_id")
    private int id;

    @Column(name = "bike_name")
    private  String name;

    @Column(name = "bike_colour")
    private  String colour;



}
