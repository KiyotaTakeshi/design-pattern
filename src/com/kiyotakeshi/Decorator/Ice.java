package com.kiyotakeshi.Decorator;

// Decorator
// 装飾を表すクラス
public abstract class Ice implements IceCream {

    // 中身と装飾を同じように扱うためインスタンスを持つ
    protected IceCream iceCream;

    // 引数は中身も装飾も受け付ける super class の型を指定
    protected Ice(IceCream iceCream) {
        super();
        this.iceCream = iceCream;
    }
}
