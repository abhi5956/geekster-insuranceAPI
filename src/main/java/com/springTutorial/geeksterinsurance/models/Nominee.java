package com.springTutorial.geeksterinsurance.models;

import com.springTutorial.geeksterinsurance.enums.Gender;
import com.springTutorial.geeksterinsurance.enums.Relationship;
import lombok.Data;

@Data
public class Nominee {
    private Long customerId;
    private  String name;
    private  String  dob;
    private Gender gender;
    private Relationship relationship;
}
