package com.epam.rd.coffemarker.s1;

public class CoffeeMarker {

    public static Coffee buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        creditCard.charge(coffee);
        return coffee;
    }
}
