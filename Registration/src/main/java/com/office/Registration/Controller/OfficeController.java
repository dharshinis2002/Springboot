package com.office.Registration.Controller;
import com.office.Registration.Entity.Entity;
import com.office.Registration.Service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    @PostMapping("/saveOffice")
   private String save(@RequestBody Entity officeEntity) {
        return officeService.save(officeEntity);

    }

    @PutMapping("/update")
    private String update(@RequestBody Entity officeEntity) {
       return officeService.save(officeEntity);
    }


    @GetMapping("/get/{registrationId}")
    private Optional<Entity>getById(@PathVariable("registrationId")Integer registrationId) {
        return officeService.getById(registrationId);


    } @GetMapping("/getAll")
    private List<Entity>getAll(){
        return  officeService.getAll();
    }

    @DeleteMapping("/delete/{registrationId}")
    private  String deleteById(@PathVariable("registrationId")Integer registrationId){
        return  officeService.deletedById(registrationId);

    }
}
