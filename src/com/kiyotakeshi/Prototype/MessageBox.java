package com.kiyotakeshi.Prototype;

import com.kiyotakeshi.Prototype.framework.Product;

public class MessageBox implements Product {
    private final char decochar;

    public MessageBox(char c) {
        this.decochar = c;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    // clone() メソッドを他のクラスから呼べるようにするため public のメソッドでくるんでいる
    @Override
    public Product createClone() {
        Product p = null;
        try {
            // 自身の複製を作成するメソッド
            // インスタンスが持っているフィールドの値をそのまま新しいインスタンスにコピー(コンストラクタは呼ばれない)
            // フィールドの内容をそのままコピーする shallow copy のため、フィールドの先のインスタンスの中身までは考慮しない
            // Cloneable interface を実装する必要がある(スーパークラスの Product で実装)
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            // Cloneable を実装していない場合エラーになる
            e.printStackTrace();
        }
        return p;
    }
}
