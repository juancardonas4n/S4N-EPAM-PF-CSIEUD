package com.epam.rd.coffemarker.s5;

import static com.epam.rd.coffemarker.s5.common.List.fill;
import com.epam.rd.coffemarker.s5.common.Tuple;
import com.epam.rd.coffemarker.s5.common.List;

public class CoffeeMarker {

    public static Tuple<Payment, Coffee> buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        Payment payment = new Payment(creditCard, Coffee.price);
        return new Tuple<>(payment, coffee);
    }

    public static Tuple<List<Coffee>, Payment>
        buyCoffees(final int quantity,
                   final CreditCard cCard) {
        return new Tuple<>(fill(quantity, () -> new Coffee()),
                           new Payment(cCard, Coffee.price * quantity));
    }
}
