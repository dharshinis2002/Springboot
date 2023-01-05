package com.Relationship.relationship.Repository;

import com.Relationship.relationship.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product,Integer> {


}
