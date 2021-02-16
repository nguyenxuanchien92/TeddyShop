package com.cg.project_module_4.repository.admin.customer;

import com.cg.project_module_4.model.admin.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepo extends PagingAndSortingRepository<Customer, String> {
}
