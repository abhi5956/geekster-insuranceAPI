package com.springTutorial.geeksterinsurance.services.impls;

import com.springTutorial.geeksterinsurance.models.Customer;
import com.springTutorial.geeksterinsurance.models.Wallet;
import com.springTutorial.geeksterinsurance.services.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@Slf4j
public class DefaultWalletService implements WalletService {


    @Override
    public Wallet createWallet(Long customerId) {
        final Wallet wallet= new Wallet();
        wallet.setCustomerId(customerId);
        wallet.setWalletId(123L);
        wallet.setBalance(BigDecimal.ZERO);
        return wallet;
    }

    @Override
    public Wallet addToWallet(final Long walletId, final BigDecimal amount) {
        final Wallet wallet= new Wallet();
        wallet.setCustomerId(123L);
        wallet.setWalletId(123L);
        wallet.setBalance(BigDecimal.ZERO);
        return null;
    }
}
