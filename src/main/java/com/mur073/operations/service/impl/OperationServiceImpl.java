package com.mur073.operations.service.impl;

import com.mur073.operations.dto.TransferMoneyRequestDto;
import com.mur073.operations.service.OperationService;
import com.mur073.operations.web.CardApi;
import com.mur073.operations.web.UserApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class OperationServiceImpl implements OperationService {

  private Boolean canSendMoney(UUID userId) {
    return true;
  }

    private final UserApi userApi;
    private final CardApi cardApi;

    @Override
    public String transferMoney(TransferMoneyRequestDto request) {
//        UserDto sender = userApi.getUser(request.getUserId());

        // 1. Validate sender and card: status and balance
        // 2. Validate receiver card: status
        // 3. Create operation (status=pending)
        // 4. Freeze sender account
        // 5. Transfer money from sender to bank corr account
        // 6. Transfer money from corr account to receiver account
        // 7. Update operation status=success
        throw new RuntimeException("Not implemented");
    }

  private Boolean canReceiveMoney(UUID userId) {
    return true;
  }
}
