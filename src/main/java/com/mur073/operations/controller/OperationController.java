package com.mur073.operations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("operations")
public class OperationController {
    @GetMapping
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("index");
    }
}
