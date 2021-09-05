package com.kiyotakeshi.Visitor5;

import java.util.Iterator;

public abstract class Unit implements Element {

    public abstract String getName();

    protected Unit add(Unit unit) throws Exception {
        throw new Exception();
    }

    public Iterator<Unit> iterator() throws Exception {
        throw new Exception();
    }

    @Override
    public String toString() {
        return getName();
    }
}
