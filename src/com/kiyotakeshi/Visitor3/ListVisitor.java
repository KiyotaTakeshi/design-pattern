package com.kiyotakeshi.Visitor3;

import java.util.Iterator;

// ConcreteVisitor
public class ListVisitor implements Visitor {
    private String currentDir = "";

    // file クラスのインスタンスに対して行うべき処理
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
