package com.cg.project_module_4.service.admin.customer.impl;

import com.cg.project_module_4.model.admin.Customer;
import com.cg.project_module_4.repository.admin.customer.CustomerRepo;
import com.cg.project_module_4.service.admin.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Iterable<Customer> findAllCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public void save(Customer customer) {
        //....
        customerRepo.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepo.delete(customer);
    }

    @Override
    public Optional<Customer> findById(String id) {
        return customerRepo.findById(id);
    }



}
