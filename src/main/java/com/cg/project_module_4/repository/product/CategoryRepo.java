package com.cg.project_module_4.repository.product;

import com.cg.project_module_4.model.product.Category;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepo extends PagingAndSortingRepository<Category, String> {
}
