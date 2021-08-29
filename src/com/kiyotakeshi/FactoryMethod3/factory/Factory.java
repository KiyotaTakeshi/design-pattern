package com.kiyotakeshi.FactoryMethod3.factory;

// Creator(抽象的な工場)
public abstract class Factory {

    // template method pattern と組み合わせることで、インスタンス生成の前後に何かしらの処理を入れることが可能
    // サブクラスに override させないために final
    public final Product create(String serialNumber){
        Product product = createProduct(serialNumber);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String serialNumber);

    protected abstract void registerProduct(Product product);
}
