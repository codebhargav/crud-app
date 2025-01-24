package com.bhargav.crudapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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


    @JsonProperty
    private String email;
    @JsonProperty
    private String name;
    @JsonProperty
    private int rollNo;

}
