package com.mur073.operations.controller;

import com.mur073.operations.dto.TransferMoneyRequestDto;
import com.mur073.operations.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("operations")
@RequiredArgsConstructor()
public class OperationController {

    final private OperationService operationService;

    @GetMapping
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Operations microservice");
    }

    @PostMapping("/transfer-money")
    public ResponseEntity<String> transferMoney(@Validated @RequestBody TransferMoneyRequestDto request) {
        return ResponseEntity.ok(operationService.transferMoney(request));
    }
}
