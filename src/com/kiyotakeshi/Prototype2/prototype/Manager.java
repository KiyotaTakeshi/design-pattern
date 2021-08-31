package com.kiyotakeshi.Prototype2.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Item> itemMap = new HashMap<>();

    public void register(String name, Item item){
        this.itemMap.put(name, item);
    }

    // Item interface のメソッドを呼び出してインスタンスを生成
    // sub class(Potion,Sword の package) が追加されても
    // Manager class は修正が不要
    public Item create(String itemName){
        Item item = this.itemMap.get(itemName);
        return item.createClone();
    }
}
