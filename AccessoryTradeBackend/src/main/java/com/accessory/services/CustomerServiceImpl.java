package com.accessory.services;

import com.accessory.messagr.MessageType;
import com.accessory.messagr.MessageWrapper;
import com.accessory.model.user.Customer;
import com.accessory.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public MessageWrapper addCustomer(Customer customer) {
        customerRepository.insertCustomer(customer);
        MessageWrapper messageWrapper = new MessageWrapper();
        messageWrapper.setMessageType(MessageType.SUCCESS);
        messageWrapper.setData("Added");

        return  messageWrapper;

    }
}
