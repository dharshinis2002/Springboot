package com.Relationship.relationship.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "consumer_table")
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

   @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "email")
    private  String email;
    @Column(name = "gender")
    private  String gender;

    @OneToMany(mappedBy = "consumer",fetch =FetchType.EAGER,cascade = CascadeType.ALL)

    private List<Product>product;
}
