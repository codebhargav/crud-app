package com.bhargav.crudapp.controller;


import com.bhargav.crudapp.model.Employee;
import com.bhargav.crudapp.model.Student;
import com.bhargav.crudapp.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    StudentServiceImpl studentserviceimpl;


    @PostMapping("/store")
    public Student savestudent(@RequestBody Student student){
        return studentserviceimpl.create(student);

    }

    @GetMapping("/")
    public String check(@RequestBody Employee employee){
        return  employee!=null ? "data is maping" : "data is not maaping";
    }





}

