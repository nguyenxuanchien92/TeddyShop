package com.cg.project_module_4.repository.product;


import com.cg.project_module_4.model.product.Size;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SizeRepo extends PagingAndSortingRepository<Size, String> {
}
