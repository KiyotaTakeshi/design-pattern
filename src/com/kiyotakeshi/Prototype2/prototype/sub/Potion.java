package com.kiyotakeshi.Prototype2.prototype.sub;

import com.kiyotakeshi.Prototype2.prototype.Item;

public class Potion implements Item {

    private final String name;

    public Potion(String name) {
        super();
        this.name = name;
    }

    @Override
    public void get() {
        System.out.printf("%s getting!\n", this.name);
    }

    @Override
    public void use() {
        System.out.printf("%s used\n", this.name);
    }

    @Override
    public Item createClone() {
        Item item = null;
        try {
            item = (Item) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}
