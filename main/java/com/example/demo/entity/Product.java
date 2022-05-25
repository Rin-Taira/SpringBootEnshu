package com.example.demo.entity;

public class Product {
	private Integer productId;
	private String productName;
	private Integer price;

	public Product() {
	}

	public Product(Integer productId, String productName, Integer price) {
	    this.productId = productId;
	    this.productName = productName;
	    this.price = price;
	}
	public Integer getProductId() {
	    return this.productId;
	}

	public void setProductId(Integer productId) {
	    this.productId = productId;
	}

	public String getProductName() {
	    return this.productName;
	}

	public void setProductName(String productName) {
	    this.productName = productName;
	}

	public Integer getPrice() {
	    return this.price;
	}

	public void setPrice(Integer price) {
	    this.price = price;
	}

	public String getProductInfo() {
        return "product_id=" + productId + ", product_name=" + productName + ", price=" + price;
    }
}
