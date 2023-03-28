package com.epam.rd.coffemarker.s2;

public class Purchase {
    public Coffee coffee;
    public Payment payment;

    public Purchase(Coffee coffee, Payment payment) {
        this.coffee = coffee;
        this.payment = payment;
    }
}
