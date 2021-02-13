//package com.cg.project_module_4.repository.product;
//
//import com.cg.project_module_4.model.product.Category;
//import com.cg.project_module_4.model.product.Product;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.PagingAndSortingRepository;
//
//public interface ProductRepo extends PagingAndSortingRepository<Product, Long> {
//
//    Iterable<Product> findAllByCategory(Category province);
//
//    Page<Product> findAllByName(String name, Pageable pageable);
//
//
//
//}
