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

    public void add(Product newProduct) {
        if (productsInCart == null) {
            productsInCart.add(newProduct);
            return;
        } else if (productsInCart.contains(newProduct)) {
            System.out.println(newProduct.getProductName() + " уже добавлен в корзину");
            return;
        } else {
            productsInCart.add(newProduct);
            totalAmountInRub += newProduct.getPrice();
            totalDiscountInRub += newProduct.getDiscount();
            totalAmountWithDiscountInRub += newProduct.getPriceWithDiscount();
            totalCountOfProducts++;
        }
    }

    public void delete(Product unnecessaryProduct) {
        if (productsInCart == null) {
            System.out.println("Корзина пуста");
            return;
        } else if (!productsInCart.contains(unnecessaryProduct)) {
            System.out.println(unnecessaryProduct.getProductName() + " нет в корзине");
            return;
        } else {
            productsInCart.remove(unnecessaryProduct);
            totalAmountInRub -= unnecessaryProduct.getPrice();
            totalDiscountInRub -= unnecessaryProduct.getDiscount();
            totalAmountWithDiscountInRub -= unnecessaryProduct.getPriceWithDiscount();
            totalCountOfProducts--;
        }
    }

    public int countOfProductsInCart() {
        return productsInCart.size();
    }
}

