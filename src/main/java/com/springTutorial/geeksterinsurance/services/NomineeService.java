package com.springTutorial.geeksterinsurance.services;

import com.springTutorial.geeksterinsurance.models.Nominee;

public interface NomineeService {
    Nominee createNominee(final long customerId, final Nominee nominee);
}
