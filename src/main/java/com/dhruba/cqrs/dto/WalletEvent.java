package com.dhruba.cqrs.dto;

import java.math.BigDecimal;
import java.util.UUID;

public sealed interface WalletEvent {
    record DepositEvent(UUID walletId, BigDecimal amount) implements WalletEvent {}
    record WithdrawEvent(UUID walletId, BigDecimal amount) implements WalletEvent {}
}
