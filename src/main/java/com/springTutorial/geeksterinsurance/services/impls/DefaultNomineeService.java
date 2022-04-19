package com.springTutorial.geeksterinsurance.services.impls;

import com.springTutorial.geeksterinsurance.models.Nominee;
import com.springTutorial.geeksterinsurance.services.NomineeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultNomineeService implements NomineeService {


    @Override
    public Nominee createNominee(final long customerId, final Nominee nominee) {
        nominee.setCustomerId(customerId);
        return nominee;
    }
}
