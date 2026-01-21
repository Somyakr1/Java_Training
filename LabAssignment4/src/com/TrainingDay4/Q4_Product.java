package com.TrainingDay4;

public class Q4_Product {
	
	private int productId;
    private String productName;
    private double productPrice;

    public Q4_Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return productName + " - " + productPrice + " rupees";
    }
}
