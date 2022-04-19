package com.springTutorial.geeksterinsurance.Controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springTutorial.geeksterinsurance.dtos.requests.NomineeDTO;
import com.springTutorial.geeksterinsurance.dtos.requests.RegistrationRequest;
import com.springTutorial.geeksterinsurance.dtos.responses.RegisteredDTO;
import com.springTutorial.geeksterinsurance.models.Customer;
import com.springTutorial.geeksterinsurance.models.Nominee;
import com.springTutorial.geeksterinsurance.models.Wallet;
import com.springTutorial.geeksterinsurance.services.CustomerService;
import com.springTutorial.geeksterinsurance.services.NomineeService;
import com.springTutorial.geeksterinsurance.services.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@RestController
@Slf4j
public class RegistrationController {

    private  final ObjectMapper objectMapper= new ObjectMapper();
    @PostConstruct
    private void init(){
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }
    @Autowired
    private CustomerService customerService;
    @Autowired
    private NomineeService nomineeService;
    @Autowired
    private WalletService walletService;
    @PostMapping("signup")
    public ResponseEntity<RegisteredDTO>register(@Validated @RequestBody final RegistrationRequest registrationRequest){
    log.info("Received Registration Request:{}",registrationRequest);
        Customer customer= objectMapper.convertValue(registrationRequest,Customer.class);
        log.info("Converted to the Customer Model:{}",customer);
        customer= customerService.CreateCustomer(customer);
        //call customer Service
        log.info("created customer: {}",customer);
        final NomineeDTO nomineeDTO= registrationRequest.getNominee();
        final Nominee nominee =objectMapper.convertValue(nomineeDTO, Nominee.class);
        log.info("Created Nominee: {}", nominee);
        nomineeService.createNominee(customer.getId(), nominee);
        log.info("Created Nominee: {}",nominee);

        final Wallet wallet= walletService.createWallet(customer.getId());
        log.info("Created Wallet: {}",wallet);
        walletService.addToWallet(wallet.getWalletId(), BigDecimal.valueOf(100));
        return ResponseEntity.ok(new RegisteredDTO());

    }

}
