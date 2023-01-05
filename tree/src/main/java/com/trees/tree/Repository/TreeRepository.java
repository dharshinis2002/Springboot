package com.trees.tree.Repository;

import com.trees.tree.Entity.TreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<TreeEntity,Integer> {

}
