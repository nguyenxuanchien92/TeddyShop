package com.cg.project_module_4.cuc.model;

import javax.persistence.*;

@Entity
@Table
public class Size {
    @Id
    private String id;
    private String name;

    public Size() {
    }

    public Size(String id, String name) {
        this.id = id;
        this.name = name;
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
}
