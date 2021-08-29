package com.kiyotakeshi.FactoryMethod2.idcard;

import com.kiyotakeshi.FactoryMethod2.framework.Product;

public class IDCard implements Product {

    private final String owner;
    private final int serial;

    public IDCard(String owner, int serial) {
        System.out.printf("create %s's card. serial %s%n", owner, serial);
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.printf("use %s's card. serial %s%n", this.owner, this.serial);
    }

    public String getOwner(){
        return this.owner;
    }

    public int getSerial() {
        return this.serial;
    }
}
