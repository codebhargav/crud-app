package com.bhargav.crudapp.controller;


import com.bhargav.crudapp.model.Student;
import com.bhargav.crudapp.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class studentcontroller {


    @Autowired
    studentservice studentservice;

    @GetMapping("/student")
    public String index(){
        return "hello";
    }

    @PostMapping("/store")
    public Student savesrudent(@RequestBody Student student){
        return studentservice.create(student);

    }





}

