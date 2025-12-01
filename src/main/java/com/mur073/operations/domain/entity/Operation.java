package com.mur073.operations.domain.entity;

import com.mur073.operations.domain.OperationStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "operations")
public class Operation extends BaseEntity {
  @Column(name = "user_id", nullable = false)
  private UUID userId;

  @Column(name = "status", nullable = false)
  @Enumerated(EnumType.STRING)
  private OperationStatus status;

  @Column(name = "amount", nullable = false, updatable = false)
  private BigDecimal amount;

  @Column(name = "currency", nullable = false, updatable = false)
  private String currency;

  @Column(name = "details_encoded", nullable = false, updatable = false, columnDefinition = "TEXT")
  private String detailsEncoded;

  @Column(name = "details_hash", nullable = false, updatable = false, columnDefinition = "TEXT")
  private String detailsHash;

  @OneToMany(mappedBy = "operation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Transaction> transactions = new ArrayList<>();

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Operation operation = (Operation) o;
    return Objects.equals(userId, operation.userId)
        && status == operation.status
        && Objects.equals(amount, operation.amount)
        && Objects.equals(currency, operation.currency)
        && Objects.equals(detailsEncoded, operation.detailsEncoded)
        && Objects.equals(detailsHash, operation.detailsHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(), userId, status, amount, currency, detailsEncoded, detailsHash);
  }
}
