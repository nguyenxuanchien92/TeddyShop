package com.cg.project_module_4.model.product;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class ManageProducts {
    @Id
    private String id;
    private Date date_Added;
    private Date nsx;
    private Date hsd;
    private int quantity;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

}
