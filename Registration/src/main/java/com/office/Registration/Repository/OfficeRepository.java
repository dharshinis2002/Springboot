package com.office.Registration.Repository;

import com.office.Registration.Entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Entity,Integer> {


}
