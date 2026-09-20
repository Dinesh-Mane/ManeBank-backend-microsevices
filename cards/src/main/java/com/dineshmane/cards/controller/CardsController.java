package com.dineshmane.cards.controller;

import com.dineshmane.cards.constants.CardsConstants;
import com.dineshmane.cards.dto.ResponseDto;
import com.dineshmane.cards.service.ICardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
public class CardsController {

    private final ICardsService cardsService;

    // for sanity check
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello Dinesh Mane !!!");
    }


    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createCard(@RequestParam("mobileNumber") String mobileNo){
        cardsService.createCard(mobileNo);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(CardsConstants.STATUS_201, CardsConstants.MESSAGE_201));
    }

}
