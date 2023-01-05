package com.market.shop.repository;

import com.market.shop.Entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface ShopRepository extends JpaRepository<ShopEntity ,Integer> {
}
