package com.bhargav.crudapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class Employee {

    @JsonProperty
    private String name;
    @JsonProperty
    private String email;
}
