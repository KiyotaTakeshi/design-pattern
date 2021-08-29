package com.kiyotakeshi.Adaptor;

public class Main {
    public static void main(String[] args) {
        // Print interface のメソッドだけを用いるという点を強調するため、 Print 型の変数に代入する
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
