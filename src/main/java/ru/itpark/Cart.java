package ru.itpark;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int totalCountOfProducts;
    private int totalDiscountInRub;
    private int totalAmountInRub;
    private int totalAmountWithDiscountInRub;

    List<Product> productsInCart = new ArrayList<Product>();

    public int getTotalDiscountInRub() {
        return totalDiscountInRub;
    }

    public int getTotalCountOfProducts() {
        return totalCountOfProducts;
    }

    public int getTotalAmountInRub() {
        return totalAmountInRub;
    }

    public int getTotalAmountWithDiscountInRub() {
        return totalAmountWithDiscountInRub;
    }

    public void add(Product product) {
        if (productsInCart == null) {
            productsInCart.add(product);
            return;
        }
        if (productsInCart.contains(product)) {
            return;
        }
        productsInCart.add(product);
        totalAmountInRub += product.getPrice();
        totalDiscountInRub += product.getDiscount();
        totalAmountWithDiscountInRub += product.getPriceWithDiscount();
        totalCountOfProducts++;
    }

    public void delete(Product product) {
        if (productsInCart == null) {
            return;
        }
        if (!productsInCart.contains(product)) {
            return;
        }
        productsInCart.remove(product);
        totalAmountInRub -= product.getPrice();
        totalDiscountInRub -= product.getDiscount();
        totalAmountWithDiscountInRub -= product.getPriceWithDiscount();
        totalCountOfProducts--;
    }

    public int countOfProductsInCart() {
        return productsInCart.size();
    }
}

