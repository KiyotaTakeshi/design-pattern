package com.kiyotakeshi.Decorator;

// ConcreteDecorator
public class Vanilla extends Ice {
    private int price = 50;

    public Vanilla(IceCream iceCream) {
        // 親クラス(Ice) のコンストラクタを呼ぶ
        super(iceCream);
    }

    @Override
    public int getPrice() {
        // 自身の価格に別の IceCream インスタンスを価格を追加
        return this.price + iceCream.getPrice();
    }

    @Override
    public String getName() {
        return "Vanilla" + iceCream.getName();
    }
}
