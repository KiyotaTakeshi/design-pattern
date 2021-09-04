package com.kiyotakeshi.Composite2;

// component(leaf,composite を同一視して扱う)
public abstract class Unit {

    public abstract String getName();

    public abstract void printList(String prefix);

    protected abstract void add(Unit unit);

    @Override
    public String toString() {
        return getName();
    }
}
