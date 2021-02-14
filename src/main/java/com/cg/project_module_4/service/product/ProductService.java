package com.cg.project_module_4.service.product;

import com.cg.project_module_4.model.product.Category;
import com.cg.project_module_4.model.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(String id);

    void save(Product product);

    void remove(String id);

    Iterable<Product> findAllByCategory(Category province);

    Page<Product> findAllByName(String name, Pageable pageable);

}
