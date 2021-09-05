package com.kiyotakeshi.Visitor5;

public interface Visitor {
    // ConcreteElement ごとに visit method を定義
    void visit(Group group);

    void visit(Department department);
}
