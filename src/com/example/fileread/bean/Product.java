package com.example.fileread.bean;

import java.util.Objects;

public class Product {
    private String productName;
    private int productId;
    private double productPrice;
    private double productWeight;
    private String productDetails;

    public Product() {
    }

    public Product(String productName, int productId, double productPrice, double productWeight, String productDetails) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.productDetails = productDetails;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(productPrice, product.productPrice) == 0 && Double.compare(productWeight, product.productWeight) == 0 && Objects.equals(productName, product.productName) && Objects.equals(productDetails, product.productDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productId, productPrice, productWeight, productDetails);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", productWeight=" + productWeight +
                ", productDetails='" + productDetails + '\'' +
                '}';
    }
}
