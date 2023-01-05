package com.onetomany.onetomany.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "factory_table")

public class DressFactory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_code")
    private int productCode;

    @Column(name = "material_type")
    private String materialType;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_on")
    private Date createOn;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_on")
    private Date updateOn;

   @Column(name = "deleted_by")
   private  String DeletedBy;

   @Column(name = "deleted_on")
   private Date DeletedOn;

   @Column(name = "status")
   private  String   status;

    @OneToMany(mappedBy = "dressFactory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<RawMaterial>rawMaterial;


    @OneToMany(mappedBy = "dressFactory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OutputProduct>outputProduct;
}
