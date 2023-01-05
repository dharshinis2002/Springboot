package com.exampledemo.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
    private  int studentsId;
    private  String studentsName ;
    private  int studentsAge;


}
