package com.trees.tree.Controller;

import com.trees.tree.Entity.TreeEntity;
import com.trees.tree.Service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TreeController {
   @Autowired
    private TreeService treeService;

    @PostMapping("/save")
    private String sava(@RequestBody TreeEntity treeEntity){
        treeService.save(treeEntity);
        return "saved successfully";

    }@PutMapping("/update")
    private  String update(@RequestBody TreeEntity treeEntity) {
        treeService.update(treeEntity);
        return "updated successfully";

    }@GetMapping("/get/{treeId}")
    private Optional<TreeEntity>getById(@PathVariable ("tree_id")Integer id ){
        return treeService.getById(id);

    }@GetMapping("/getAll")
   private List<TreeEntity>getAll(){
        return treeService.getAll();

    }@DeleteMapping("/delete/{id}")
    private  String deleteById(@PathVariable("id")Integer Id){
        return  treeService.deleteById(Id);
    }
}
