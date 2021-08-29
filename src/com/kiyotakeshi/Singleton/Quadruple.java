package com.kiyotakeshi.Singleton;

// Singleton pattern で4つだけインスタンスを生成
public class Quadruple {

    // Singleton pattern のため、
    // private static field に自分のインスタンスを持っておく
    // 宣言時に、 new Quadruple() とコンストラクタを呼び出すことで
    // クラスの初期化時に1度だけ実行される
    private static Quadruple[] quadruples = new Quadruple[]{
            new Quadruple(0),
            new Quadruple(1),
            new Quadruple(2),
            new Quadruple(3)
    };

    private int id;

    // 外部からインスタンス生成を防ぐため、 private にする
    private Quadruple(int id) {
        System.out.printf("The instance %s is created.\n", id);
        this.id = id;
    }

    // 1つしか作られないインスタンスを外部から取得するため、メソッドを static にする
    public static Quadruple getInstance(int id){
        return quadruples[id];
    }

    @Override
    public String toString() {
        return "Quadruple{" +
                "id=" + id +
                '}';
    }
}
