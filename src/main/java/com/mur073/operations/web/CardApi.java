package com.mur073.operations.web;

import com.mur073.operations.dto.CardDto;

public interface CardApi {
    CardDto getCardByPan(String pan);
}
