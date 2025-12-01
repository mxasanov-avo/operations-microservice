package com.mur073.operations.web.impl;

import com.mur073.operations.dto.UserDto;
import com.mur073.operations.web.UserApi;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserApiImpl implements UserApi {
    @Override
    public Boolean isValidUser(UUID userId) {
        return false;
    }
}
