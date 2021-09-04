package com.kiyotakeshi.Decorator;

// ConcreteDecorator
public class Chocolate extends Ice {

    private int price = 70;

    protected Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        // 自身の価格に別の IceCream インスタンスを価格を追加
        // iceCream.getPrice は委譲
        return this.price + iceCream.getPrice();
    }

    @Override
    public String getName() {
        // iceCream.getName は委譲
        return "choco" + iceCream.getName();
    }
}
