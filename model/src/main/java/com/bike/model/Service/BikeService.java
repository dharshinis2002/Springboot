package com.bike.model.Service;
import com.bike.model.Entity.BikeEntity;
import com.bike.model.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BikeService {
    @Autowired
    BikeRepository bikeRepository;

    public String save(List<BikeEntity> bikeEntity) {
        for (BikeEntity i : bikeEntity) {
            BikeEntity obj = new BikeEntity();
            bikeRepository.saveAndFlush(bikeEntity);
        } return "success";

        }
    }



