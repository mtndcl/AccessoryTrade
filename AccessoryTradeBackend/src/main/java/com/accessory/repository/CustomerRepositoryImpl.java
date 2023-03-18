package com.accessory.repository;

import com.accessory.model.user.Customer;
import org.springframework.data.domain.Example;

import java.util.Optional;

public abstract class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void insertCustomer(Customer customer) {
        insertCustomer(customer);
    }

}
