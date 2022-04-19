package com.springTutorial.geeksterinsurance.models;

import com.springTutorial.geeksterinsurance.enums.Gender;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Customer {

    private Long id;
    private String name;
    private String dob;
    private Gender gender;
    private  String status;
}
