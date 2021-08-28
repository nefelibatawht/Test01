package com.nefelibata.test01.entity;

public class Product {
    int PID;
    String username;
    String ProductName;
    int ProductPrice;
    String ProductInfo;

    public Product(int PID, String username, String productName, int productPrice, String productInfo) {
        this.PID = PID;
        this.username = username;
        ProductName = productName;
        ProductPrice = productPrice;
        ProductInfo = productInfo;
    }

    public Product() {
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(String productInfo) {
        ProductInfo = productInfo;
    }

}
