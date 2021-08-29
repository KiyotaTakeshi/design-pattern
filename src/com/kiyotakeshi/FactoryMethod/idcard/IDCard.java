package com.kiyotakeshi.FactoryMethod.idcard;

import com.kiyotakeshi.FactoryMethod.framework.Product;

public class IDCard implements Product {

    private final String owner;

    public IDCard(String owner) {
        System.out.printf("create %s's card%n", owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.printf("use card: %s%n", this.owner);
    }

    public String getOwner(){
        return this.owner;
    }
}
