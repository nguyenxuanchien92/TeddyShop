package com.cg.project_module_4.service.admin.account.impl;

import com.cg.project_module_4.model.admin.Account;
import com.cg.project_module_4.repository.admin.account.AccountRepo;
import com.cg.project_module_4.service.admin.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public Iterable<Account> findAllAccount() {
        return accountRepo.findAll();
    }

    @Override
    public void save(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void delete(Account account) {
        accountRepo.delete(account);
    }

    @Override
    public Optional<Account> findById(String id) {
        return accountRepo.findById(id);
    }
}
