package ru.itpark;

public class Product {
    private long id;
    private String productName;
    private int price;
    private int discount;
    private int hundredPercent = 100;
    private boolean bestSeller;


    public Product(long id, String productName, int price, int discount, boolean bestSeller) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.bestSeller = bestSeller;
    }

    public int getPriceWithDiscount() {
        int priceWithDiscount = price - (price * discount / hundredPercent);
        return priceWithDiscount;
    }

    public String getProductName() {
        return productName;
    }
    public int getPrice() { return (price); }

    public int getDiscount() {
        int discountInRub = price * discount / hundredPercent;
        return discountInRub;
    }
}

