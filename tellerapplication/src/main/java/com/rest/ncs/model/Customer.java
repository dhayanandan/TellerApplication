package com.rest.ncs.model;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {

    private long id;
    private String name;
    private String email;
    private String address;
    private String phone;

    public Customer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "CUST_NAME", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "ADDRESS ", nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "EMAIL", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "PHONE", nullable = false)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) { this.phone = phone; }
}
