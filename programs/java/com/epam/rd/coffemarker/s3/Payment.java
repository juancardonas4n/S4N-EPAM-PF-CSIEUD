package com.epam.rd.coffemarker.s3;

public class Payment {

    public final CreditCard creditCard;
    public final int amount;
    public Payment(CreditCard creditCard, int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }
}
