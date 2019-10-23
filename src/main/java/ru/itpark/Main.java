package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(2345, "Товар1", 1_000, 10, true);
        Product product2 = new Product(2456, "Товар2", 1_000, 10, true);
        Product product3 = new Product(2555, "Товар3", 1_000, 0, true);
        Product product4 = new Product(2589, "Товар4", 1_000, 0, true);

        Cart cart = new Cart();

        cart.add(product1);
        cart.add(product2);
        cart.add(product3);
        cart.add(product4);

        cart.delete(product1);
        cart.delete(product4);

        System.out.println("Количество товаров " + cart.getTotalCountOfProducts());
        System.out.println("Общая стоимость без скидки " + cart.getTotalAmountInRub());
        System.out.println("Скидка " + cart.getTotalDiscountInRub());
        System.out.println("Общая стоимость со скидкой " + cart.getTotalAmountWithDiscountInRub());
    }
}
