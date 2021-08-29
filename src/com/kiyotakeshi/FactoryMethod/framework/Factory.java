package com.kiyotakeshi.FactoryMethod.framework;

// framework package 側は idcard package を import していない(依存していない)
public abstract class Factory {

    // template method パターンで処理の流れを規定
    // このクラスは abstract ではないのでサブクラスで継承しなくて良い
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 抽象メソッドになっているため、サブクラスで実装することが強制されている
    protected abstract Product createProduct(String owner);

    // デフォルトの実装を用意する場合は Product を new しているので Product を interface にできない
//    protected Product createProduct(String name){
//        return new Product(name);
//    };

    protected abstract void registerProduct(Product product);
}
