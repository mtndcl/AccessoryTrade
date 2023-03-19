package com.accessory.controller;


import com.accessory.messagr.MessageWrapper;
import com.accessory.model.user.Customer;
import com.accessory.services.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }


    @PostMapping("adduser")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
       customerService.addCustomer(customer);

       return ResponseEntity.ok(customer);
    }

}
