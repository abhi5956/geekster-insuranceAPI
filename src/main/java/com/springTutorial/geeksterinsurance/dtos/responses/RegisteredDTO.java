package com.springTutorial.geeksterinsurance.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springTutorial.geeksterinsurance.enums.RequestStatus;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
@Data
public class RegisteredDTO {

    private RequestStatus status;
    @JsonProperty(value = "policy_number")
    private String policyNumber;

}
