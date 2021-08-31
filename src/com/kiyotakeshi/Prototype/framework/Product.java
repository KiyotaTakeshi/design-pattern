package com.kiyotakeshi.Prototype.framework;

// 複製を可能にするため Cloneable interface(marker interface) を継承
public interface Product extends Cloneable {
    public void use(String s);
    public Product createClone();
}
