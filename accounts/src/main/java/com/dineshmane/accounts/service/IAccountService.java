package com.dineshmane.accounts.service;

import com.dineshmane.accounts.dto.CustomerDto;

public interface IAccountService {
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    Boolean updateAccount(CustomerDto customerDto);
}
