package com.entityRelationship.entityRelationship.Controller;

import com.entityRelationship.entityRelationship.Entity.Dresses;
import com.entityRelationship.entityRelationship.Entity.Purchaser;
import com.entityRelationship.entityRelationship.Service.PurchaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PurchaserController {
    @Autowired
    private PurchaserService purchaserService;

    @PostMapping("/savePost")
    private String save(@RequestBody Purchaser purchaser) {
        purchaserService.save(purchaser);
        return "saved";
    }

    @PutMapping("/update")
    private String update(@RequestBody Purchaser purchaser) {
        purchaserService.update(purchaser);
        return "updated";
    }

    @GetMapping("/getAll")
    private List<Purchaser> getAll() {
        return purchaserService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<Purchaser> getById(@PathVariable Integer id) {
        return purchaserService.getById(id);

    }@DeleteMapping("/delete/{id}")
    private void deleteById(@PathVariable Integer id){
        purchaserService.deleteById(id);
    }


}