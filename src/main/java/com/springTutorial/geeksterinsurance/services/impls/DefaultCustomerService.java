package com.springTutorial.geeksterinsurance.services.impls;

import com.springTutorial.geeksterinsurance.models.Customer;
import com.springTutorial.geeksterinsurance.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultCustomerService implements CustomerService {
    @Override
    public Customer CreateCustomer(Customer customer) {
        customer.setId(1L);
        return customer;
    }
}
