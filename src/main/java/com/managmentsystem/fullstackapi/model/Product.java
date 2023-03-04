package com.managmentsystem.fullstackapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Will automatically connected with database
public class Product {

    @Id
    @GeneratedValue // will create another table for tracking ID within MySQL
    private Long id;
    private String name;
    private double price;
    private int quantity;
    private String description;
    private String url;

    // Getters
    public String getUrl() { return url; }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDescription() { return description; }


    // Setters
    public void setUrl(String url) { this.url = url; }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
