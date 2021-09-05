package com.kiyotakeshi.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

// ConcreteElement
// element の interface を実装
// ObjectStructure
// オブジェクトの構造役
public class Directory extends Entry {

    private final String name;

    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            size += entry.getSize();
        }
        return size;
    }

    // directory class では使用可能
    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    // directory class では使用可能
    @Override
    public Iterator iterator() {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
