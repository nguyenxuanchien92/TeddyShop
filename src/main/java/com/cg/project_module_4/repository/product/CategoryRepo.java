package com.cg.project_module_4.repository.product;

import com.cg.project_module_4.model.product.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, String> {
}
