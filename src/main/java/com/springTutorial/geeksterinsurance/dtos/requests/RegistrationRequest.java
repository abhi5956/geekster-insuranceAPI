package com.springTutorial.geeksterinsurance.dtos.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springTutorial.geeksterinsurance.enums.Gender;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class RegistrationRequest {

    @NotNull(message = "Name cannot be null")
    @NotEmpty(message = "Name cannot be empty")
    @NotBlank(message = "name cannot be blank")
    private  String name;
    @NotNull(message = "DOB Name cannot be null")
    private String dob;
    @NotNull(message = "Gender cannot be null")
    private Gender gender;
    @NotNull(message = "policyId cannot be null")
    @NotEmpty(message = "policyId cannot be empty")
    @NotBlank(message = "policyId cannot be blank")
    private String policyId;
    @JsonProperty(value = "insurance_id")
    private String insuranceId;
    @Valid
    private NomineeDTO nominee;
}
