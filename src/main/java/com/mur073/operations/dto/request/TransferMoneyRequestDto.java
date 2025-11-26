package com.mur073.operations.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Currency;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class TransferMoneyRequestDto {
    @NotNull(message = "User id must be valid uuid")
    private UUID userId;

    @NotBlank(message = "Currency cannot be blank")
    private String currency;

    @Positive(message = "Amount must be a positive")
    private BigDecimal amount;

    @CreditCardNumber(message = "PAN must be a valid card number")
    private String senderPAN;

    @NotBlank(message = "Sender name cannot be blank")
    private String senderName;

    @CreditCardNumber(message = "PAN must be a valid card number")
    private String receiverPAN;

    @NotBlank(message = "Receiver name cannot be blank")
    private String receiverName;
}
