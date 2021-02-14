package com.cg.project_module_4.controller.product;

import com.cg.project_module_4.model.product.Category;
import com.cg.project_module_4.model.product.Product;
import com.cg.project_module_4.model.product.Size;
import com.cg.project_module_4.service.product.CategoryService;
import com.cg.project_module_4.service.product.ProductService;

import com.cg.project_module_4.service.product.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> provinces(){
        return categoryService.findAll();
    }

    @Autowired
    public ProductService productService;

    @Autowired
    private SizeService sizeService;

    @ModelAttribute("sizes")
    public Iterable<Size> sizes(){
        return sizeService.findAll();
    }


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

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable String id){
        productService.remove(id);
        return "redirect:/home";
    }

    @PostMapping("/create-product")
    public ModelAndView createProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        System.out.println(product.getId());
        ModelAndView modelAndView = new ModelAndView("product/add");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "New product created successfully");
        return modelAndView;
    }


}
