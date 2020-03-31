package com.codeup.annotationdemo.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Persistent;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.NonNull;
import lombok.Getter;

import org.testng.annotations.Optional;


@Entity // annotating a class
public class Product {
    @Id     // annotate a property
    private int id;

    @Getter // annotation a property; creates a method
    private float price;

    @Persistent // annotating a property
    protected String name = null;

    public String getName() {
        return name;
    }

    @Deprecated // annotate a method
    public void setPrice(float price) {
        this.price = price;
    }

    // annotating a parameter
    public void setName(@Optional String name) {
        this.name = name;
    }

    public List addToCart(List cart) {
        @NonNull // annotating a local variable
                List localCart = cart == null ? new ArrayList() : cart;
        localCart.add(getName());
        return localCart;
    }
}
