package com.bhargav.crudapp.repo;

import com.bhargav.crudapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface studentrepo  extends JpaRepository<Student,Integer> {
}




