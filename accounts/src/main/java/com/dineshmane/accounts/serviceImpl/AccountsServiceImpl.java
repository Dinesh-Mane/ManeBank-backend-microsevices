package com.dineshmane.accounts.serviceImpl;

import com.dineshmane.accounts.constants.AccountsConstants;
import com.dineshmane.accounts.dto.CustomerDto;
import com.dineshmane.accounts.entity.Accounts;
import com.dineshmane.accounts.entity.Customer;
import com.dineshmane.accounts.mapper.CustomerMapper;
import com.dineshmane.accounts.repository.AccountsRepository;
import com.dineshmane.accounts.repository.CustomerRepository;
import com.dineshmane.accounts.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class AccountsServiceImpl implements IAccountService {

    private final AccountsRepository accountsRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer){
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccountNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccountNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
