package com.entityRelationship.entityRelationship.Repository;

import com.entityRelationship.entityRelationship.Entity.Purchaser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaserRepository extends JpaRepository<Purchaser,Integer> {
}
