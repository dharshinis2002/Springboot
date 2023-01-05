package com.Laptop.laptop.Service;

import com.Laptop.laptop.DTO.LaptopDTO;
import com.Laptop.laptop.Entity.Laptop;
import com.Laptop.laptop.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public String save(List<LaptopDTO> laptopDTO) {
        Laptop laptop1;
        for (LaptopDTO i : laptopDTO) {
            laptop1 = new Laptop();
            laptop1.setGb(i.getGb());
            laptop1.setQuantity(i.getQuantity());
            laptop1.setPrice(laptop1.getPrice());
            laptop1.setModel(i.getModel());
            laptopRepository.save(laptop1);

        }
        return "saved";

    }

    public String update(List<LaptopDTO> laptopDTO) {
        Laptop laptop1;      //null
        for (LaptopDTO i : laptopDTO) {
            //   if (i.getId() > 0) {
            laptop1 = new Laptop();
            // }
            laptop1.setId(i.getId());
            laptop1.setModel(i.getModel());
            laptop1.setGb(i.getGb());
            laptop1.setPrice(laptop1.getPrice());
            laptop1.setQuantity(i.getQuantity());
            laptopRepository.saveAndFlush(laptop1);
        }
        return "updated";
    }

    public List<Laptop> getAll() {
        return laptopRepository.findAll();


    }

    public Optional<Laptop> getById(Integer id) {
        return laptopRepository.findById(id);

    }

    public String deleteBYId(Integer id) {
        laptopRepository.deleteById(id);
        return "deleted";
    }

    //query
    public Optional<Laptop> findByModel(String model) {
        return laptopRepository.findByModel(model);
    }


}
