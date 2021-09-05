package com.kiyotakeshi.Visitor3;

// Element
// visitor の訪問先を表す、 accept メソッドを宣言する
public interface Element {
    void accept(Visitor v);
}
