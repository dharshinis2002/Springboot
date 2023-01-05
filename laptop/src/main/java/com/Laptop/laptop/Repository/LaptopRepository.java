package com.Laptop.laptop.Repository;

import com.Laptop.laptop.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
    @Query(value = "select * from laptop where model =:model",nativeQuery = true)
    Optional<Laptop> findByModel(String model);
}
