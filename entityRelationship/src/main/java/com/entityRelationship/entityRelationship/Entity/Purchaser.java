package com.entityRelationship.entityRelationship.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "purchaser")
public class Purchaser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "address")
    private  String address;
    @Column(name = "phone_num")
    private  String phone;
    @Column(name = "note")
    private  String note;

    @OneToMany(mappedBy ="purchaser",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Dresses>dresses;


}
