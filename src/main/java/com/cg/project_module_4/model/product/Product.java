package com.cg.project_module_4.model.product;

import javax.persistence.*;

@Entity
@Table
public class Product {
    @Id
    private String id;

    @Column(unique = true)
    private String name;

    private double price;
    private String desv;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;

}
