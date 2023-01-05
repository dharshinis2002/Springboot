package com.bike.model.Controller;

import com.bike.model.Entity.BikeEntity;
import com.bike.model.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BikeController {
    @Autowired
   private BikeService bikeService;

    @PostMapping("/saveBike")
    private  String save (@RequestBody List<BikeEntity>bikeEntities){
        bikeService.save(bikeEntities);
        return  "success";
    }
}
