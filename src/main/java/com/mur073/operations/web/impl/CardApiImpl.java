package com.mur073.operations.web.impl;

import com.mur073.operations.dto.CardDto;
import com.mur073.operations.web.CardApi;
import org.springframework.stereotype.Service;

@Service
public class CardApiImpl implements CardApi {
    @Override
    public CardDto getCardByPan(String pan) {
        return new CardDto();
    }
}
