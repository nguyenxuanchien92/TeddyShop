package com.cg.project_module_4.service.product;

import com.cg.project_module_4.model.product.Category;
import com.cg.project_module_4.model.product.Size;

public interface SizeService {
    Iterable<Size> findAll();
}
