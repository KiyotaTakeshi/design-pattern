package com.kiyotakeshi.Visitor5;

// ConcreteElement(要素の実装クラス)
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
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
