package com.kiyotakeshi.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        // スーパークラス型の変数にサブクラスのインスタンスを代入して動作させる(LSP)
        // CharDisplay charDisplay = new CharDisplay('H');
        // charDisplay.display();

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d1.display();
        d2.display();
    }
}
