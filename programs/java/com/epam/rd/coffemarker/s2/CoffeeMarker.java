package com.epam.rd.coffemarker.s2;

public class CoffeeMarker {

    public static Purchase buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, coffee.getAmount());
        return new Purchase(coffee, payment);
    }
}
