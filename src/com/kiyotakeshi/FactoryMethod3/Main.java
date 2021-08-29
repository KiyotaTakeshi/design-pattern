package com.kiyotakeshi.FactoryMethod3;

import com.kiyotakeshi.FactoryMethod3.factory.Factory;
import com.kiyotakeshi.FactoryMethod3.factory.Product;
import com.kiyotakeshi.FactoryMethod3.pc.PcFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new PcFactory();
        Product pc1 = factory.create("A1");
        Product pc2 = factory.create("A2");

        pc1.use();
        pc2.use();
    }
}
