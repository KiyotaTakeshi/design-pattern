package com.kiyotakeshi.Builder;

import java.util.List;

// インスタンスを作成するためのインターフェース(API)を定める
public interface Builder {
    // 作成するために必要かつ十分なメソッドを宣言(固有のメソッドを提供しない)
    public void makeHeader();
    public void makeEmployeeList(List<Employee> employeeList);
}
