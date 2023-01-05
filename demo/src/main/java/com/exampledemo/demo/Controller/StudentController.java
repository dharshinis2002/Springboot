package com.exampledemo.demo.Controller;
import com.exampledemo.demo.Entity.StudentEntity;
import com.exampledemo.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/saveStudents")
    public String save(@RequestBody StudentEntity studentEntity) {
        studentService.Save(studentEntity);
        return "success";


    } @PutMapping("/updateStudents")
    public  String update(@RequestBody StudentEntity studentEntity){
        studentService.Save(studentEntity);
        return "ok";


    }@GetMapping("/get/{StudentsId}")
    private Optional<StudentEntity>getById(@PathVariable("StudentsId")Integer studentsId){
        return  studentService.getById(studentsId);


    }@GetMapping("/getAll")
    private List<StudentEntity>getAll(){
        return studentService.getAll();


    }@DeleteMapping("/delete/{StudentId}")
    private  String deleteById(@PathVariable("StudentsId")Integer studentsId){
        return  studentService.deleteById(studentsId);
    }


}
