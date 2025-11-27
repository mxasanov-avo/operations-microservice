package com.mur073.operations.domain.entity;

import com.mur073.operations.domain.TransactionDirection;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {
    @Column(name = "account_id", nullable = false, updatable = false)
    private UUID accountId;

    @Column(name = "direction", nullable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private TransactionDirection direction;

    @Column(name = "amount", nullable = false, updatable = false)
    private BigDecimal amount;

    @Column(name = "balance_after", nullable = false, updatable = false)
    private BigDecimal balanceAfter;

    @ManyToOne
    @JoinColumn(name = "operation_id", nullable = false, updatable = false)
    private Operation operation;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(accountId, that.accountId) && direction == that.direction && Objects.equals(amount, that.amount) && Objects.equals(balanceAfter, that.balanceAfter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accountId, direction, amount, balanceAfter);
    }
}


