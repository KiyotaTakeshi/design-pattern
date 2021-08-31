package com.kiyotakeshi.Prototype.framework;

import java.util.HashMap;

// Product interface を使ってインスタンスの複製を行う
public class Manager {
    // 名前とインスタンスの対応関係を表現
    private HashMap<String, Product> showcase = new HashMap();

    public void register(String name, Product proto){
        this.showcase.put(name, proto);
    }

    public Product create(String protoname){
        Product p = this.showcase.get(protoname);
        return p.createClone();
    }
}
