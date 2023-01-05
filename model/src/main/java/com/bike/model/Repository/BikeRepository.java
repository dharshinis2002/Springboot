package com.bike.model.Repository;

import com.bike.model.Entity.BikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<BikeEntity ,Integer> {
}
