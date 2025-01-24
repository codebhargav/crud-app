package com.bhargav.crudapp.service.impl;

import com.bhargav.crudapp.model.Student;
import com.bhargav.crudapp.repo.StudentRepo;
import com.bhargav.crudapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepo studentrepo;

    @Override
    public Student create(Student student) {
        return studentrepo.save(student) ;
    }
}




