package com.office.Registration.Service;

import com.office.Registration.Entity.Entity;
import com.office.Registration.Repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeService {
   @Autowired
    private OfficeRepository officeRepository;

   public String save(Entity officeEntity){
       officeRepository.saveAndFlush(officeEntity);
       return "saved";
   }
   public String update(Entity officeEntity){
       officeRepository.save(officeEntity);
       return "updated";
    }
    public Optional<Entity> getById(Integer id) {
        return officeRepository.findById(id);
    }
    public List<Entity> getAll(){
        return officeRepository.findAll();

    }
    public String deletedById(Integer id){
       officeRepository.deleteById(id);
       return "deleted";

    }

}
