package com.mur073.operations.service;

import com.mur073.operations.dto.TransferMoneyRequestDto;

public interface OperationService {
    String transferMoney(TransferMoneyRequestDto request);
}
