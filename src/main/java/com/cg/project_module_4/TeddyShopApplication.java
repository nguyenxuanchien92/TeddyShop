package com.cg.project_module_4;

import com.cg.project_module_4.service.product.ProductService;
import com.cg.project_module_4.service.product.imp.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeddyShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeddyShopApplication.class, args);
    }
    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }
}