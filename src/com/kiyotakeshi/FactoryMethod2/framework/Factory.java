package com.kiyotakeshi.FactoryMethod2.framework;

// framework package 側は idcard package を import していない(依存していない)
// com.kiyotakeshi.FactoryMethod package のソースコードを修正する必要はまったくない
public abstract class Factory {

    // template method パターンで処理の流れを規定
    // このクラスは abstract ではないのでサブクラスで継承しなくて良い
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
