package com.epam.rd.coffemarker.s5;

public class CreditCard {

    public void charge(Coffee coffee) {
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CreditCard)
            return true;
        return false;
    } 
}
