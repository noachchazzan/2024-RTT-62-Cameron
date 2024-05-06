package org.example;

public class SwitchCaseExample {
    enum Cars {
        BMW,
        AUDI,
        JEEP,
        FORD;
    }
    public static void main(String[] args) {
        int x = 11;
        Cars c;
        c = Cars.AUDI;
        switch (c) {
            case BMW:
                System.out.println("10");
                break;
            case AUDI:
                System.out.println("20");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
