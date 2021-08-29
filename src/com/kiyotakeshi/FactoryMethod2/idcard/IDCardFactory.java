package com.kiyotakeshi.FactoryMethod2.idcard;

import com.kiyotakeshi.FactoryMethod2.framework.Factory;
import com.kiyotakeshi.FactoryMethod2.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {

    private HashMap<Integer, String> database = new HashMap();
    private int serial = 1;

    // synchronized を付与することでマルチスレッドで動作させた際に、
    // 異なるインスタンスに同じ通し番号がつくことを防ぐ
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, this.serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        this.database.put(card.getSerial(), card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }
}
