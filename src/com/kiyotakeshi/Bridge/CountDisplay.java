package com.kiyotakeshi.Bridge;

// RefinedAbstraction = 機能クラスに機能を追加したもの
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
