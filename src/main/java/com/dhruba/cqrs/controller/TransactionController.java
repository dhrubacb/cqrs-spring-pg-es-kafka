package com.dhruba.cqrs.controller;

import com.dhruba.cqrs.dto.DepositBody;
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
    @PostMapping("/deposit")
    public ResponseEntity<?> deposit( @RequestBody DepositBody depositBody) {
        return ResponseEntity.ok().build();
    }

}
