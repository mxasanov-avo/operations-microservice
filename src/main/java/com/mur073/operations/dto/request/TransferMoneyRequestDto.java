package com.mur073.operations.dto.request;

import com.mur073.operations.domain.TransactionDirection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class TranserMoneyRequestDto {
    private UUID userId;

    @NotBlank(message = "Currency cannot be blank")
    private String currency;

    @Positive(message = "Amount must be a positive")
    private BigDecimal amount;

    @CreditCardNumber(message = "PAN must be a valid card number")
    private String pan;
}
