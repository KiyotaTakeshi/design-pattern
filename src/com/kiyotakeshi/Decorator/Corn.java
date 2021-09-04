package com.kiyotakeshi.Decorator;

// ConcreteComponent
// 中身を表すクラス
public class Corn implements IceCream {

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getName() {
        return "Ice cream";
    }
}
