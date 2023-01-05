package com.socialmedia.activity.Controller;

import com.socialmedia.activity.Entity.Social;
import com.socialmedia.activity.DTO.SocialDTO;
import com.socialmedia.activity.Service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SocialController {
    @Autowired
    private SocialService socialService;


    @PostMapping("/save")
    private  String save(@RequestBody Social socialDAO){
        return socialService.save(socialDAO);

    }

    @GetMapping("/getAll")
    private ArrayList<SocialDTO>getAll(){
       return socialService.getAllActivity();

    }
}
