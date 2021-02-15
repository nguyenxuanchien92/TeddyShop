package com.cg.project_module_4.model.admin;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {
    @Id
    private String Id;
    private String userName;
    private String passWord;
    private Date createDate;
    private String roleId;
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
