package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber - Input mobile number
     * @return accounts Details base on a given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

}
