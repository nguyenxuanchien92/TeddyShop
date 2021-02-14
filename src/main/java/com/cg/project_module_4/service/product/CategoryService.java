package com.cg.project_module_4.service.product;

import com.cg.project_module_4.model.product.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(String id);

    void save(Category province);

    void remove(Long id);
}
