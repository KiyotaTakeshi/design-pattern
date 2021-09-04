package com.kiyotakeshi.Composite;

import java.util.ArrayList;
import java.util.Iterator;

// Composite
// 容器を表し、 Leaf, Composite を入れられる
public class Directory extends Entry {

    private final String name;
    private ArrayList<Entry> directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();

        while (it.hasNext()) {
            // file, directory に関係なく扱うことで再帰的呼び出しに対応できる
            Entry entry = it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        // file, directory 関係なく追加するという操作を ArrayList に委譲している
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        // this を出力する際に toString method が呼ばれる
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
