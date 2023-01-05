package com.Relationship.relationship.Service;

import com.Relationship.relationship.Entity.Consumer;
import com.Relationship.relationship.Entity.Product;
import com.Relationship.relationship.Repository.ConsumerRepository;
import com.Relationship.relationship.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class ConsumerService {
    @Autowired
    private ConsumerRepository consumerRepository;
    @Autowired
    private ProductRepository productRepository;



    public String save(Consumer consumer) {
       consumerRepository.save(consumer);
        for (Product i : consumer.getProduct()) {
            i.setConsumer(consumer);
            productRepository.saveAndFlush(i);

        }

        return "success";
    }
}