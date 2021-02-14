package com.cg.project_module_4.service.product;

import com.cg.project_module_4.model.product.Category;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(String id);

    void save(Category province);

    void remove(String id);
}
