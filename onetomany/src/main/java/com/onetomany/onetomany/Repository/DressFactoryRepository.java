package com.onetomany.onetomany.Repository;

import com.onetomany.onetomany.Entity.DressFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.websocket.Session;

@Repository
public interface DressFactoryRepository extends JpaRepository<DressFactory,Integer> {
}
