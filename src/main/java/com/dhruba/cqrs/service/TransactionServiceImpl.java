package com.dhruba.cqrs.service;

import com.dhruba.cqrs.dto.WalletEvent;
import com.dhruba.cqrs.repo.EventEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final EventEntityRepo eventEntityRepo;

    @Override
    public void deposit(WalletEvent.DepositEvent event) {

    }
}
