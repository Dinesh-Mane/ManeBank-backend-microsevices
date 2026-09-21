package com.dineshmane.cards.service;

import com.dineshmane.cards.dto.CardsDto;

public interface ICardsService {

    void createCard(String mobileNumber);
    CardsDto fetchCard(String mobileNumber);

}
