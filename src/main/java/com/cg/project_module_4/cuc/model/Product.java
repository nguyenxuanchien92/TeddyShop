package com.cg.project_module_4.cuc.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table
public class Product {
    @Id
    private String id;
    private String name;
    @ManyToOne
    @JoinColumn(name="size_id")
    private Size size_id;
    private String desc;
    private long price;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Product() {
    }

    public Product(String id, String name, Size size_id, String desc, long price, Category category) {
        this.id = id;
        this.name = name;
        this.size_id = size_id;
        this.desc = desc;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize_id() {
        return size_id;
    }

    public void setSize_id(Size size_id) {
        this.size_id = size_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
