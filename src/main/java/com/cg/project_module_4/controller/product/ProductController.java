package com.cg.project_module_4.controller.product;

import com.cg.project_module_4.model.product.Product;
import com.cg.project_module_4.service.product.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/home")
    public ModelAndView showHome(@RequestParam("s") Optional<String> s, Pageable pageable){
        Page<Product> products;
        System.out.println(s);

        if(s.isPresent()){
            products = productService.findAllByName(s.get(), pageable);
        } else {
            products = productService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("product/home");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("product/add");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }


}
