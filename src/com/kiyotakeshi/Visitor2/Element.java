package com.kiyotakeshi.Visitor2;

// Element
// visitor の訪問先を表す、 accept メソッドを宣言する
public interface Element {
    void accept(Visitor v);
}
