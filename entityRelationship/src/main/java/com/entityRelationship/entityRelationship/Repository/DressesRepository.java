package com.entityRelationship.entityRelationship.Repository;

import com.entityRelationship.entityRelationship.Entity.Dresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DressesRepository extends JpaRepository<Dresses,Integer> {
}
