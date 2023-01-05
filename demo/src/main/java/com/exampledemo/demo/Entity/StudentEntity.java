package com.exampledemo.demo.Entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="StudentsId")
    private  int studentId;
    @Column(name="StudentsName")
    private  String studentName ;
    @Column(name="studentsAge")
    private  int studentsAge;


}
