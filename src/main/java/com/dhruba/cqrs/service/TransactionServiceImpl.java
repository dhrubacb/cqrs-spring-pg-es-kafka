package com.dhruba.cqrs.service;

import com.dhruba.cqrs.dto.WalletEvent;
import com.dhruba.cqrs.entity.EventEntity;
import com.dhruba.cqrs.repo.EventEntityRepo;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final EventEntityRepo eventEntityRepo;

    public TransactionServiceImpl(EventEntityRepo eventEntityRepo) {
        this.eventEntityRepo = eventEntityRepo;
    }

    @Override
    public void deposit(WalletEvent.DepositEvent event) {

    }
}
