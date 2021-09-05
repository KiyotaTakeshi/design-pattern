package com.kiyotakeshi.Visitor;

// Visitor
// データ構造の具体的な要素ごとに訪問したというメソッドを宣言
public interface Visitor {

    void visit(File file);

    void visit(Directory directory);
}
