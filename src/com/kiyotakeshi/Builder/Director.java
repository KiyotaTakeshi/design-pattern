package com.kiyotakeshi.Builder;

import java.util.List;

// Builder のインターフェース(API)をつかってインスタンスを生成する
// ConcreteBuilder に依存したプログラミングは行わない
public class Director {
    private final Builder builder;

    // 引数は Builder 型だが、実際に渡されるのは Builder クラスのサブクラスのインスタンス
    // (Builder 型は interface なのでインスタンスを作れないため)
    // どんなサブクラスが渡されるかは知らないからこそ Builder 型の実装であれば入れ替えが可能なため、交換可能性が高い
    public Director(Builder builder) {
        super();
        this.builder = builder;
    }

    // builder interface のメソッドを使ってインスタンスを組み立てる
    // 他のクラス(builder のサブクラス)に処理を委譲している
    public void construct(List<Employee> employeeList) {
        // Builder のメソッドのみを使うので、実際にどの Builder 動いているかは意識しない
        builder.makeHeader();
        builder.makeEmployeeList(employeeList);
    }
}
