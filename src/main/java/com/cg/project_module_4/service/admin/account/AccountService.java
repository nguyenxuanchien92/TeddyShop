package com.cg.project_module_4.service.admin.account;

import com.cg.project_module_4.model.admin.Account;

import java.util.Optional;

public interface AccountService {
    Iterable<Account> findAllAccount();

    void save(Account account);

    void delete(Account account);

    Optional<Account> findById(String id);
}
