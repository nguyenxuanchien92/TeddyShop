package com.cg.project_module_4.service.admin.customer;
import com.cg.project_module_4.model.admin.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAllCustomer();

    void save(Customer customer);

    void delete(Customer customer);

    Optional<Customer> findById(String id);
}
