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


    /**
     *
     *  @param customerDto - CustomerDto Object
     *  @return boolean value indicate whether account is updated or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     *  @param mobileNumber - Input mobile number
     *  @return boolean value indicating if the delete Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
