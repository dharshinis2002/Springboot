package com.onetomany.onetomany.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "raw_material_table")
public  class RawMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "material_name")
    private String materialName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "uom")
    private String uom;

    @Column(name = "manufact_amount")
    private int manufactureAmount;

    @Column(name = "sales_amount")
    private int salesAmount;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dressFactory_id")
    @JsonIgnore
    private  DressFactory dressFactory;
}