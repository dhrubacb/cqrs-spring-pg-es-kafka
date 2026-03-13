package com.dhruba.cqrs.service;

import com.dhruba.cqrs.dto.WalletEvent;

public interface TransactionService {
    void deposit(WalletEvent.DepositEvent event);
}
