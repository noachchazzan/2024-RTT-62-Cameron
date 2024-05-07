package org.example.coffeShop;

import java.util.Objects;

public class Product {
    // member variables of class product
    private double price;
    private String name;

    private boolean beverage;
    // constuctors below memb
    public Product() {

    }

    public Product(double price, String name, boolean beverage) {
        this.price = price;
        this.name = name;
        this.beverage = beverage;
    }
    // methods members of class product
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeverage() {
        return beverage;
    }

    public void setBeverage(boolean beverage) {
        this.beverage = beverage;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Double.compare(getPrice(), that.getPrice()) == 0 && isBeverage() == that.isBeverage() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getName(), isBeverage());
    }

    @Override
    public String toString() {
        return "MenuProduct{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", beverage=" + beverage +
                '}';
    }
}
