package com.Laptop.laptop.Controller;

import com.Laptop.laptop.DTO.LaptopDTO;
import com.Laptop.laptop.Entity.Laptop;
import com.Laptop.laptop.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping("/save")
    private String save(@RequestBody List<LaptopDTO>laptopDTO){
        laptopService.save(laptopDTO);
       return "saved successfully";
    }

    @PutMapping("/update")
    private  String update(@RequestBody List<LaptopDTO>laptopDTO){
        laptopService.update(laptopDTO);
        return  "updated successfully";

    }@GetMapping("/getAll")
    private  List<Laptop> getAll(){
       return laptopService.getAll();


    }@GetMapping("/get/{id}")
    private Optional<Laptop>getById(@PathVariable ("id")Integer id){
        return  laptopService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
     private String deleteById(@PathVariable ("id") Integer id){
    return laptopService.deleteBYId(id);
    }
    //query

    @GetMapping("/getmodel/{model}")
   private Optional<Laptop>findById(@PathVariable ("model" )String model) {
        return laptopService.findByModel(model);

    }


     }
