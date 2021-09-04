package com.kiyotakeshi.Composite2;

// leaf(子となるオブジェクトは持たない)
public class Group extends Unit {

    private final String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    protected void add(Unit unit) {
    }
}
