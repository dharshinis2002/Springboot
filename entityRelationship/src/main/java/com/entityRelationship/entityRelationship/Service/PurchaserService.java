package com.entityRelationship.entityRelationship.Service;

import com.entityRelationship.entityRelationship.Entity.Dresses;
import com.entityRelationship.entityRelationship.Entity.Purchaser;
import com.entityRelationship.entityRelationship.Repository.DressesRepository;
import com.entityRelationship.entityRelationship.Repository.PurchaserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaserService {
    @Autowired
    private PurchaserRepository purchaserRepository;
    @Autowired
    private DressesRepository dressesRepository;

    public String save(Purchaser purchaser) {
        purchaser = purchaserRepository.save(purchaser);
        for (Dresses i : purchaser.getDresses()) {
            i.setPurchaser(purchaser);
            dressesRepository.saveAndFlush(i);
        }
        return "success";
    }

    public String update(Purchaser purchaser) {
       purchaser = purchaserRepository.save(purchaser);
        for (Dresses i : purchaser.getDresses()) {
            i.setPurchaser(purchaser);
            dressesRepository.saveAndFlush(i);
        }
        return "updated";
    }

    public List<Purchaser> getAll() {
        return purchaserRepository.findAll();


//    }public Purchaser getById(Integer id) {
//        Optional<Purchaser> obj = purchaserRepository.findById(id);
//        Purchaser obj1 = obj.get();
//        return obj1;
//    }
//    }  public Optional<Purchaser>getById(Integer id){
//        Optional<Purchaser> obj=purchaserRepository.findById(id);
//        return obj;
//
//    }
    }  public Optional<Purchaser>getById(Integer id) {
         return  purchaserRepository.findById(id);
    }


    public String deleteById(Integer id){
        purchaserRepository.deleteById(id);
        return "deleted";
    }
}