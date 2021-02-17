package com.cg.project_module_4;

import com.cg.project_module_4.repository.admin.account.AccountRepo;
import com.cg.project_module_4.service.admin.account.AccountService;
import com.cg.project_module_4.service.admin.account.impl.AccountServiceImpl;
import com.cg.project_module_4.service.admin.customer.CustomerService;
import com.cg.project_module_4.service.admin.customer.impl.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeddyShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeddyShopApplication.class, args);
    }

    @Bean
    public AccountService accountService(){
        return new AccountServiceImpl();
    }

    @Bean
    public CustomerService customerService(){
        return new CustomerServiceImpl();
    }
}
