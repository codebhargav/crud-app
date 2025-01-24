package com.bhargav.crudapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;  // This will be the primary key
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "rollno")
    private int rollno;

}
