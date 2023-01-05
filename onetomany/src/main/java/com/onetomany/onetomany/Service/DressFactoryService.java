package com.onetomany.onetomany.Service;

import ch.qos.logback.core.filter.Filter;
import com.onetomany.onetomany.Entity.DressFactory;
import com.onetomany.onetomany.Entity.OutputProduct;
import com.onetomany.onetomany.Entity.RawMaterial;
import com.onetomany.onetomany.Repository.DressFactoryRepository;
import com.onetomany.onetomany.Repository.OutputProductRepository;
import com.onetomany.onetomany.Repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.Session;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DressFactoryService {

   @Autowired
   private DressFactoryRepository dressFactoryRepository;
   @Autowired
    private RawMaterialRepository materialRepository;
   @Autowired
    private OutputProductRepository ProductRepository;

    public String save(DressFactory dressFactory) {
        Date date = new Date();
        dressFactory.setCreateOn(date);
        dressFactory.setUpdateOn(date);

        dressFactory =dressFactoryRepository.save(dressFactory);
        for (RawMaterial obj : dressFactory.getRawMaterial()) {
            obj.setDressFactory(dressFactory);
            materialRepository.saveAndFlush(obj);
        }
        for (OutputProduct obj : dressFactory.getOutputProduct()) {
            obj.setDressFactory(dressFactory);
            ProductRepository.saveAndFlush(obj);
        }
        return "saved";
    }
    public void delete(Integer id){
        dressFactoryRepository.deleteById(id);
    }
    public List<DressFactory> getAll(){
        return dressFactoryRepository.findAll();
    }
    public Optional<DressFactory> getById(Integer id){
        return dressFactoryRepository.findById(id);
    }
    public String update(DressFactory dressFactory){
        dressFactoryRepository.save(dressFactory);
        return "updated";

    }public void deleted(Integer id){
        if(id !=null){
            Optional<DressFactory>dressFactoryObj=dressFactoryRepository.findById(id);
            DressFactory obj=dressFactoryObj.get();
            obj.setStatus("active");
            obj.setDeletedBy("dharshini");
            obj.setDeletedOn(new Date());
            dressFactoryRepository.save(obj);
        }
    }
}
