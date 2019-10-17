package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Product product_1 = new Product(2345, "Товар_1", 1_000, 10, true);
        Product product_2 = new Product(2456, "Товар_2", 1_000, 10, true);
        Product product_3 = new Product(2555, "Товар_3", 1_000, 0, true);
        Product product_4 = new Product(2589, "Товар_4", 1_000, 0, true);

        Cart cart = new Cart();

        cart.add(product_1);
        cart.add(product_2);
        cart.add(product_3);
        cart.add(product_4);

        cart.delete(product_1);
        cart.delete(product_4);

        System.out.println("Количество товаров " + cart.getTotalCountOfProducts());
        System.out.println("Общая стоимость без скидки " + cart.getTotalAmountInRub());
        System.out.println("Скидка " + cart.getTotalDiscountInRub());
        System.out.println("Общая стоимость со скидкой " + cart.getTotalAmountWithDiscountInRub());
    }
}
