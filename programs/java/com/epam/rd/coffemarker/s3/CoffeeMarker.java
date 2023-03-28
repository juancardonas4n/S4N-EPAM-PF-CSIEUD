package com.epam.rd.coffemarker.s3;

public class CoffeeMarker {

    public static Tuple<Payment, Coffee> buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, coffee.price);
        return new Tuple<>(payment, coffee);
    }
}
