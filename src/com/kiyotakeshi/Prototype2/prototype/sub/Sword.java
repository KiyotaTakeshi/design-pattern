package com.kiyotakeshi.Prototype2.prototype.sub;

import com.kiyotakeshi.Prototype2.prototype.Item;

public class Sword implements Item {

    private String name;

    public Sword(String name) {
        super();
        this.name = name;
    }

    @Override
    public void get() {
        System.out.printf("%s getting!\n", this.name);
    }

    @Override
    public void use() {
        System.out.printf("attach by %s\n", this.name);
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
