package com.kiyotakeshi.FactoryMethod3.pc;

import com.kiyotakeshi.FactoryMethod3.factory.Product;

// Concrete Product
public class Pc implements Product {

    private final String serialNumber;

    public Pc(String serialNumber) {
        super();
        System.out.printf("create PC (%s)", serialNumber);
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.printf("use PC (%s)", this.serialNumber);
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}
