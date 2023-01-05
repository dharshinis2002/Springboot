package com.exampledemo.demo.Service;

import com.exampledemo.demo.Entity.StudentEntity;
import com.exampledemo.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


   public String Save(StudentEntity studentEntity) {
        studentRepository.saveAndFlush(studentEntity);
        return "success";

    }

    public String Update(StudentEntity studentEntity) {
        studentRepository.saveAndFlush(studentEntity);
        return "create success";

    }

    public Optional<StudentEntity> getById(Integer id) {
        return studentRepository.findById(id);

    }public List<StudentEntity>getAll(){
        return  studentRepository.findAll();
    }

    public String  deleteById(Integer id) {
        studentRepository.deleteById(id);
        return "deleted";

    } }