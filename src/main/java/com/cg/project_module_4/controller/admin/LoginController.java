package com.cg.project_module_4.controller.admin;

import com.cg.project_module_4.model.admin.Account;
import com.cg.project_module_4.model.admin.Customer;
import com.cg.project_module_4.service.admin.account.AccountService;
import com.cg.project_module_4.service.admin.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private AccountService accountService;

    @GetMapping("/register-login")
    public ModelAndView showFormRegisterLogin() {
        ModelAndView mav = new ModelAndView("/account/account_register");
        Account account = new Account();
        Customer customer = new Customer();
        mav.addObject("account", account);
        mav.addObject("customer", customer);

        return mav;
    }

    @PostMapping("/register-login")
    public ModelAndView registerAccount(@ModelAttribute("account") Account account,
                                        @ModelAttribute("customer") Customer customer) {
        accountService.save(account);
        customerService.save(customer);
        ModelAndView mav = new ModelAndView("/account/show_list_account", "account", account);
        return mav;
    }

}
