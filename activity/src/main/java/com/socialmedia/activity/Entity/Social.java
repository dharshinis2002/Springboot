package com.socialmedia.activity.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "social")
public class Social {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "status")
    private  String status;
    @Column(name = "contact")
    private int contactNum;


}
