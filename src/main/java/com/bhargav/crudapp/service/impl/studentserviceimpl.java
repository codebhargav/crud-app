package com.bhargav.crudapp.service.impl;

import com.bhargav.crudapp.model.Student;
import com.bhargav.crudapp.model.Student;
import com.bhargav.crudapp.repo.studentrepo;
import com.bhargav.crudapp.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class studentserviceimpl implements studentservice {


    @Autowired
    studentrepo studentrepo;

    @Override
    public Student create(Student student) {
        return studentrepo.save(student) ;
    }
}




