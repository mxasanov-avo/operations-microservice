package com.mur073.operations.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class CardDto {
  private UUID id;
  private UUID userId;
  private String pan;
  private UUID accountId;
  private BigDecimal balance;
  private String currency;
}
