package com.cg.project_module_4.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/register-login")
    public ModelAndView showFormRegisterLogin(){
        ModelAndView mav = new ModelAndView("/views/account/account_register");

        return mav;
    }

//    @PostMapping("/register-login")
//    public ModelAndView registerAccount(@ModelAttribute("")){
//
//    }
}
