package com.kiyotakeshi.FactoryMethod;

import com.kiyotakeshi.FactoryMethod.framework.Factory;
import com.kiyotakeshi.FactoryMethod.framework.Product;
import com.kiyotakeshi.FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // IDCard mikeCard = new IDCard("Mike");
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("mike");
        Product card2 = factory.create("popcorn");
        card1.use();
        card2.use();
    }
}
