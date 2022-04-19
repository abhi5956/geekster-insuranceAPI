package com.springTutorial.geeksterinsurance.services;

import com.springTutorial.geeksterinsurance.models.Wallet;

import java.math.BigDecimal;

public interface WalletService {
    Wallet createWallet(final Long customerId);
    Wallet addToWallet(final  Long walletId, final BigDecimal amount);
}
