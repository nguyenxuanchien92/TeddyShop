package com.cg.project_module_4.service.product.imp;

import com.cg.project_module_4.model.product.Category;
import com.cg.project_module_4.model.product.Product;
import com.cg.project_module_4.repository.product.ProductRepo;
import com.cg.project_module_4.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepo productRepo;
    @PersistenceContext
    private EntityManager em;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public Product findById(String id) {

        TypedQuery<Product> query = em.createQuery("select p from Product p where  p.id=:id", Product.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);

    }

    @Override
    public void remove(String id) {
        Product product=findById(id);
        productRepo.delete(product);
    }

    @Override
    public Iterable<Product> findAllByCategory(Category category) {
        return productRepo.findAllByCategory(category);
    }

    @Override
    public Page<Product> findAllByName(String name, Pageable pageable) {
        return productRepo.findAllByName(name,pageable);
    }
}
