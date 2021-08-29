package com.kiyotakeshi.FactoryMethod2;

import com.kiyotakeshi.FactoryMethod2.framework.Factory;
import com.kiyotakeshi.FactoryMethod2.framework.Product;
import com.kiyotakeshi.FactoryMethod2.idcard.IDCardFactory;

// com.kiyotakeshi.FactoryMethod package のソースコードを修正する必要はまったくない
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("mike");
        Product card2 = factory.create("popcorn");
        card1.use();
        card2.use();
    }
}
