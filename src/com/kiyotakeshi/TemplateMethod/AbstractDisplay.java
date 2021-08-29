package com.kiyotakeshi.TemplateMethod;

// abstract method を1つでも含むクラスは abstract class として宣言する
// 全てのメソッドが抽象メソッドかつフィールドを1つも持たない場合は interface にできる
// display() が抽象メソッドではないので今回は interface にはできない
public abstract class AbstractDisplay {

    // 詳細未定メソッド
    // 具体的にどう動くか、メソッドの内部の処理は記載しない
    // 継承先のクラスで override を強制できる
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // サブクラスで変更されないように final 修飾子をつける
    public final void display(){
        open();
        for (int i = 0; i < 5; i++){
            print();
        }
        close();
    }
}
