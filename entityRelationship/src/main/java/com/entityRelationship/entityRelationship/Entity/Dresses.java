package com.entityRelationship.entityRelationship.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "dresses")
public class Dresses {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private  int id;

    @Column(name = "item_name")
    private  String name;

    @Column(name = "quantity")
    private  int quantity;

    @Column(name = "price")
    private int totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Bill_id")
    @JsonIgnore
    private  Purchaser purchaser;
}
