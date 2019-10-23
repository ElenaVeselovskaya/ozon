package ru.itpark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartTest {
    Product product1 = new Product(2345, "Товар1", 1_000, 10, true);
    Product product2 = new Product(2456, "Товар2", 1_000, 10, true);
    Product product3 = new Product(2555, "Товар3", 1_000, 0, true);
    Product product4 = new Product(2589, "Товар4", 1_000, 0, true);

    @Test
    void addExistingProductToCart() {
        Cart cart = new Cart();
        cart.add(product1);
        cart.add(product1);
        int expectedCountOfProductsInCart = 1;
        int actualCountOfProductsInCart = cart.getTotalCountOfProducts();
        Assertions.assertEquals(actualCountOfProductsInCart, expectedCountOfProductsInCart, "Count of product is wrong");

        int expectedTotalAmount = 1_000;
        int actualTotalAmount = cart.getTotalAmountInRub();
        Assertions.assertEquals(actualTotalAmount, expectedTotalAmount, "Total Amount is wrong");

        int expectedDiscount = 100;
        int actualDiscount = cart.getTotalDiscountInRub();
        Assertions.assertEquals(actualDiscount, expectedDiscount, "Total discount is wrong");

        int expectedAmountWithDiscount = 900;
        int actualAmountWithDiscount = cart.getTotalAmountWithDiscountInRub();
        Assertions.assertEquals(actualAmountWithDiscount, expectedAmountWithDiscount, "Total amount with discount is wrong");
    }

    @Test
    void addProductToCart() {
        Cart cart = new Cart();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);
        cart.add(product4);

        int expectedCountOfProductsInCart = 4;
        int actualCountOfProductsInCart = cart.countOfProductsInCart();
        Assertions.assertEquals(actualCountOfProductsInCart, expectedCountOfProductsInCart, "Count of product is not equal");

        int expectedTotalAmount = 4_000;
        int actualTotalAmount = cart.getTotalAmountInRub();
        Assertions.assertEquals(actualTotalAmount, expectedTotalAmount, "Total Amount is wrong");

        int expectedDiscount = 200;
        int actualDiscount = cart.getTotalDiscountInRub();
        Assertions.assertEquals(actualDiscount, expectedDiscount, "Total discount is wrong");

        int expectedAmountWithDiscount = 3_800;
        int actualAmountWithDiscount = cart.getTotalAmountWithDiscountInRub();
        Assertions.assertEquals(actualAmountWithDiscount, expectedAmountWithDiscount, "Total amount with discount is wrong");
    }

    @Test
    void delete() {
        Cart cart = new Cart();
        cart.add(product1);
        cart.add(product2);
        cart.add(product3);
        cart.add(product4);
        cart.delete(product1);

        int expectedCountOfProductsInCart = 3;
        int actualCountOfProductsInCart = cart.countOfProductsInCart();
        Assertions.assertEquals(actualCountOfProductsInCart, expectedCountOfProductsInCart, "Count of product is not equal");

        int expectedTotalAmount = 3_000;
        int actualTotalAmount = cart.getTotalAmountInRub();
        Assertions.assertEquals(actualTotalAmount, expectedTotalAmount, "Total Amount is wrong");

        int expectedDiscount = 100;
        int actualDiscount = cart.getTotalDiscountInRub();
        Assertions.assertEquals(actualDiscount, expectedDiscount, "Total discount is wrong");

        int expectedAmountWithDiscount = 2_900;
        int actualAmountWithDiscount = cart.getTotalAmountWithDiscountInRub();
        Assertions.assertEquals(actualAmountWithDiscount, expectedAmountWithDiscount, "Total amount with discount is wrong");
    }
}