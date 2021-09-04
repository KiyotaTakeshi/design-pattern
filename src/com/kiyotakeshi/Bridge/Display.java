package com.kiyotakeshi.Bridge;

// Abstraction = 機能クラスのスーパークラス
public class Display {

    // Implementer = 実装クラス のスーパークラスを
    // 保持するために constructor injection
    // impl フィールドが橋渡しとなっている
    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        // 実装クラスの interface に変換 = 委譲(ある意味、たらい回し)
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
