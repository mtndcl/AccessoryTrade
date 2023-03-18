package com.accessory.services;

import com.accessory.messagr.MessageWrapper;
import com.accessory.model.user.Customer;

public interface CustomerService{
    MessageWrapper addCustomer(Customer customer);
}
