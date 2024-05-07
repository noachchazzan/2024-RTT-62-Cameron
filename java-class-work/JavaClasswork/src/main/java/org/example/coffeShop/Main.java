package org.example.coffeShop;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product coffee = new Product(23.34, "mocha mama", true);

        products.add(coffee);

        System.out.println(coffee.toString());
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.initProducts();
        coffeeShop.printMenu();
    }



}
