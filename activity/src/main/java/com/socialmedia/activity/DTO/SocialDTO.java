package com.socialmedia.activity.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SocialDTO {
    private  int id;
    private  String name;
    private  String status;
    private int contactNum;


}
