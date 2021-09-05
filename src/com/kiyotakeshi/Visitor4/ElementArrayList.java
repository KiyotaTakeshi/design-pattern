package com.kiyotakeshi.Visitor4;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {

    @Override
    public void accept(Visitor v) {
        // 右辺は ArrayList のメソッド
        Iterator<Element> it = iterator();
        while (it.hasNext()){
            Element e = it.next();
            e.accept(v);
        }
    }
}
