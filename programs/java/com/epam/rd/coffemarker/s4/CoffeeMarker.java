package com.epam.rd.coffemarker.s4;

public class CoffeeMarker {

    public static Tuple<Payment, Coffee> buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, coffee.getAmount());
        return new Tuple<>(payment, coffee);
    }
}
