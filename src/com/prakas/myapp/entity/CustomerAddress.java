/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Prakas
 */
@Entity
@Table(name = "tbl_customer_address")
public class CustomerAddress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "customer_id",nullable = false)
    Customer customer;
    @Column(name = "address",nullable = false)
    private String address;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "portCode",nullable = false)
    private int portCode;

    public CustomerAddress() {
    }
    
    public CustomerAddress(int id){
        this.id=id;
    }

    public CustomerAddress(int id, Customer customer, String address, String city, int portCode) {
        this.id = id;
        this.customer = customer;
        this.address = address;
        this.city = city;
        this.portCode = portCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPortCode() {
        return portCode;
    }

    public void setPortCode(int portCode) {
        this.portCode = portCode;
    }
    
    
    
    
    
}
