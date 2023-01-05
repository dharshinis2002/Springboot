package com.Relationship.relationship.Repository;

import com.Relationship.relationship.Entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ConsumerRepository extends JpaRepository<Consumer,Integer> {

//    @Query("select new com.Relationship.relationship.DTO.OrderResponse (c.name ,p.productName) from consumer.c join c.products p")
//    public List<OrderResponse> getJoinInformation();


}
