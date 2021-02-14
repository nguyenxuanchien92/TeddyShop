package com.cg.project_module_4.service.product.imp;

import com.cg.project_module_4.model.product.Category;
import com.cg.project_module_4.model.product.Size;
import com.cg.project_module_4.repository.product.CategoryRepo;
import com.cg.project_module_4.repository.product.SizeRepo;
import com.cg.project_module_4.service.product.SizeService;
import org.springframework.beans.factory.annotation.Autowired;

public class SizeServiceImpl implements SizeService {

    @Autowired
    public SizeRepo sizeRepo;
    @Override
    public Iterable<Size> findAll() {
        return sizeRepo.findAll();
    }
}
