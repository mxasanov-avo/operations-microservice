package com.mur073.operations.web;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserApiImpl implements UserApi {
    @Override
    public Boolean isValidUser(UUID userId) {
        return false;
    }
}
