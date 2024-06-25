package com.example.membershipservice.domain.model;

public class Membership {
    private Long id;
    private String type;
    private double price;
    private int discountPercentage;

    // Constructor
    public Membership(Long id, String type, double price, int discountPercentage) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
