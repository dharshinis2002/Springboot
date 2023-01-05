package com.trees.tree.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tree")
public class TreeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private int Id;

    @Column(name = "name")
    private  String name;

    @Column(name = "fruits_name")
    private  String fruitsName;


}
