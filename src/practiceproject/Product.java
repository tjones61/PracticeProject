/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject;

/**
 *
 * @author tjones61
 */
public class Product {

    private int productID;
    private String productName;
    private String description;
    private double price;
    private double discount;

    public Product(int productID, String productName, String description, double price, double discount) {
        this.setProductID(productID);
        this.setProductName(productName);
        this.setDescription(description);
        this.setPrice(price);
        this.setDiscount(discount);
    }

    public final int getProductID() {
        return productID;
    }

    public final void setProductID(int productID) {
        if (productID < 0) {
            throw new IllegalArgumentException("This is not a valid product ID");
        }
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        if (productName.length() < 3) {
            throw new IllegalArgumentException("This is not a valid product name");
        }
        this.productName = productName;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        if (description.length() < 1) {
            throw new IllegalArgumentException("This is not a valid product description");
        }
        this.description = description;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        if (price < 0.01) {
            throw new IllegalArgumentException("This is not a valid price");
        }
        this.price = price;
    }

    public final double getDiscount() {
        return discount;
    }

    public final void setDiscount(double discount) {
        if (discount <0 || discount>1) {
            throw new IllegalArgumentException("This is not a valid discount");
        }
        this.discount = Discount(discount);
    }

}
