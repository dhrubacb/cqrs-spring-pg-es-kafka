package com.dhruba.cqrs.controller;

import com.dhruba.cqrs.dto.WalletEvent;
import com.dhruba.cqrs.dto.WalletEvent.DepositEvent;
import com.dhruba.cqrs.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction/v1")
@Validated
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@RequestBody DepositEvent event) {
        transactionService.deposit(event);
        return ResponseEntity.ok().build();
    }

}
