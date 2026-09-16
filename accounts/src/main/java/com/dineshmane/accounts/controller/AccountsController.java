package com.dineshmane.accounts.controller;

import com.dineshmane.accounts.constants.AccountsConstants;
import com.dineshmane.accounts.dto.CustomerDto;
import com.dineshmane.accounts.dto.ResponseDto;
import com.dineshmane.accounts.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
public class AccountsController {

    private final IAccountService accountService;

    // sanity checks
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello Dinesh!!!");
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
        accountService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
