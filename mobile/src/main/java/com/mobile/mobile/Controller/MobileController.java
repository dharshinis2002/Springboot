package com.mobile.mobile.Controller;

import com.mobile.mobile.Entity.Mobile;
import com.mobile.mobile.Service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @GetMapping("/getAll/{productName}")
   private List<Mobile> findAll(@PathVariable("productName") String productName) {
     return mobileService.findByProductName( productName);
 }
    }

//    @PostMapping("/saveMobile")
//    private String save(@RequestBody List<Mobile> mobile1) {
//        mobileService.save(mobile1);
//        return "saved";
//
//    }
//
//    @PutMapping("/update")
//    private String update(@RequestBody List<Mobile> mobile1) {
//        mobileService.save(mobile1);
//        return "updated";
//
//    }
//
//    @GetMapping("/getAll")
//    private List<Mobile> getAllMobile() {
//        return mobileService.getAllMobile();
//
//    }
//    //queries
//
//
//    @GetMapping("/getProduct/{productName}")
//    private Optional<Mobile> findById(@PathVariable("productName") String productName) {
//        return mobileService.findByProductName(productName);
//
//    }
//
//    @GetMapping("/getProductPrice/{productPrice}")
//    private Optional<Mobile> findById1(@PathVariable("productPrice") String productPrice) {
//        return mobileService.findByProductPrice(productPrice);
//
//    }
//
//    @GetMapping("/getAllName")
//    private List<Mobile> getAllName() {
//        return mobileService.getAllName();
//    }
//
//    @DeleteMapping("/deleteById/{id}")
//    private String deleteById(@PathVariable Integer id) {
//        return mobileService.deletedById(id);
//
//    }
//
//    // @GetMapping("/getAll")
//    // private List<Mobile> findAll(@RequestParam(defaultValue = "") String productName) {
//    //   return mobileService.findAll(productName);
//
//    //  }
//
//    @GetMapping("/getAll1")
//    private List<Mobile> findAll(String productColour) {
//        return mobileService.findAll(productColour);
//
//
//    }