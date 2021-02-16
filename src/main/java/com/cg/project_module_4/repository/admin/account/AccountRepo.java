package com.cg.project_module_4.repository.admin.account;

import com.cg.project_module_4.model.admin.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepo extends PagingAndSortingRepository<Account, String> {

}
