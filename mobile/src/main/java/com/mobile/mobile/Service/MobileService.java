package com.mobile.mobile.Service;

import com.mobile.mobile.Entity.Mobile;
import com.mobile.mobile.Repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobileService {

    @Autowired
    private MobileRepository mobileRepository;

    public List<Mobile> findByProductName(String productName) {
       return mobileRepository.findByProductName(productName);
}}
//    public String save (List<Mobile> mobile){
//        Mobile mobile1;
//        for (Mobile i:mobile){
//           mobile1=new Mobile();
//           mobile1.setProductName(i.getProductName());
//            mobile1.setProductPrice(i.getProductPrice());
//            mobile1.setProductColour(i.getProductColour());
//           mobileRepository.saveAndFlush(mobile1);
//          }return "success";
//
//}
//public  String update(List<Mobile>mobile) {
//    Mobile mobile1;
//    for (Mobile i : mobile) {
//        mobile1 = new Mobile();
//        mobile1.setProductName(i.getProductName());
//        mobile1.setProductColour(i.getProductColour());
//        mobile1.setProductPrice(i.getProductPrice());
//        mobileRepository.saveAndFlush(mobile1);
//    }
//    return "success";
//}
//
//    public Optional<Mobile>findByProductNames(String productName){
//      return  mobileRepository.findByProductName(productName);
//
//    }
//
//    //queries
//    public Optional<Mobile> findByProductName(String productName) {
//        return mobileRepository.findByProductName(productName);
//
//
//    }public Optional<Mobile> findByProductPrice(String productPrice) {
//        return mobileRepository.findByProductPrice(productPrice);
//
//
//    }public List<Mobile>getAllName() {
//        return mobileRepository.findAll();
//
//    } public  String deletedById(Integer id){
//        mobileRepository.deleteById(id);
//        return "deleted";
//
//    //}public List<Mobile>findAll(String productName){
//    //    return  mobileRepository.findAll(productName);
//
//    }public List<Mobile>findAll(String productColour){
//        return  mobileRepository.findAll(productColour);
//    }
//
//    }
