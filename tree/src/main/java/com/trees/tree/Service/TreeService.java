package com.trees.tree.Service;

import com.trees.tree.Entity.TreeEntity;
import com.trees.tree.Repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreeService {
    @Autowired
    private TreeRepository treeRepository;

    public String save(TreeEntity treeEntity) {
        treeRepository.saveAndFlush(treeEntity);
        return "saved";

    }

    public String update(TreeEntity treeEntity) {
        treeRepository.saveAndFlush(treeEntity);
        return "updated";

    }

    public Optional<TreeEntity> getById(Integer id) {
        return treeRepository.findById(id);


    }

    public List<TreeEntity> getAll() {
        return treeRepository.findAll();
    }

    public String deleteById(Integer id) {
        treeRepository.deleteById(id);
        return "deleted";

    }
}
