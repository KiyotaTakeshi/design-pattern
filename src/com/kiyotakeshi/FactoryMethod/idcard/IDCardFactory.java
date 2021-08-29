package com.kiyotakeshi.FactoryMethod.idcard;

import com.kiyotakeshi.FactoryMethod.framework.Factory;
import com.kiyotakeshi.FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        this.owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return this.owners;
    }
}
