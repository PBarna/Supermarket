package com.company;

/**
 * <h1>The Product class</h1>
 * The Product class is the backbone to the whole app,
 * it waits for two basic parameters: name and quantity
 */
public abstract class Product {

    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
