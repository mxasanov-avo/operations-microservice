package com.mur073.operations.service.impl;

import com.mur073.operations.dto.request.TransferMoneyRequestDto;
import com.mur073.operations.service.OperationService;
import com.mur073.operations.web.CardApi;
import com.mur073.operations.web.UserApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OperationServiceImpl implements OperationService {

    private final UserApi userApi;
    private final CardApi cardApi;

    @Override
    public String transferMoney(TransferMoneyRequestDto request) {
        // 1. Validate sender
        // 2. Validate sender card: status and balance
        // 3. Validate receiver
        // 4. Validate receiver card: status
        // 5. Create operation (status=pending)
        // 6. Freeze sender account
        // 7. Transfer money from sender to bank corr acount
        // 8. Transfer money from corr account to receiver account
        // 9. Update operation status=success
        return "not implemented";
    }
}

