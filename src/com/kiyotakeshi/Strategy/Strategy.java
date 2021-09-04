package com.kiyotakeshi.Strategy;

import java.util.List;

// Strategy
// 戦略のインターフェース
public interface Strategy {
    public Employee search(List<Employee> employeeList, int id);
}
