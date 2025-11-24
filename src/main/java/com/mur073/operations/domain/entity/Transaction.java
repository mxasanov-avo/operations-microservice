package com.mur073.operations.domain.entity;

import com.mur073.operations.domain.TransactionDirection;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {
    @Column(name = "account_id", nullable = false, updatable = false)
    private UUID accountId;

    @Column(name = "direction", nullable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private TransactionDirection direction;

    @Column(name = "balance_after", nullable = false, updatable = false)
    private BigDecimal balanceAfter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "operation_id", nullable = false, updatable = false)
    private Operation operation;
}


