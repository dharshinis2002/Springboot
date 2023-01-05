package com.onetomany.onetomany.Controller;
import com.onetomany.onetomany.Entity.DressFactory;
import com.onetomany.onetomany.Service.DressFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DressFactoryController {

    @Autowired
    private DressFactoryService dressFactoryService;


    @PostMapping("/save")
    private String save(@RequestBody DressFactory dressFactory) {
        dressFactoryService.save(dressFactory);
        return "done";
    }
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable Integer id){
        dressFactoryService.delete(id);
    }
    @GetMapping("/getAll")
    private List<DressFactory> getAll(){
        return dressFactoryService.getAll();
    }
    @GetMapping("/getById/{id}")
    private Optional<DressFactory> getById(@PathVariable Integer id){
        return dressFactoryService.getById(id);
    }
    @PutMapping("/update/{id}")
    private String update(@RequestBody DressFactory dressFactory){
        dressFactoryService.update(dressFactory);
        return "update successfully";
    }
    @PutMapping("deleted/{id}")
    private  void deleted(@PathVariable ("id")Integer id){
         dressFactoryService.deleted(id);

    }
}
