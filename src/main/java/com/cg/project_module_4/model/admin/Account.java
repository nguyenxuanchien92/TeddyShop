package com.cg.project_module_4.model.admin;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    private String Id;
    private String userName;
    private String passWord;
    private Date createDate;
    private String roleId;

    @OneToOne(mappedBy = "account")
    private Customer customer;

    public Account(String userName, String passWord, Customer customer) {
        Id = getRandomId();
        this.userName = userName;
        this.passWord = passWord;
        this.createDate = getCurrentDate();
        this.roleId = Role.NORMAL;
        this.customer = customer;
    }

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

/*    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }*/

    public String getRoleId() {
        return roleId;
    }

//    public void setRoleId(String roleId) {
//        this.roleId = roleId;
//    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private String getRandomId() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return "Ac" + timestamp.getTime();
    }

    private Date getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        return Date.from(currentDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
}
