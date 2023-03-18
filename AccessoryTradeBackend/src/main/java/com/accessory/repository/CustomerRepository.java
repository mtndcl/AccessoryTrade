package com.accessory.repository;

import com.accessory.model.Accessory;
import com.accessory.model.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{


    void insertCustomer(Customer customer);
}
