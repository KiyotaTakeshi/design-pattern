package com.kiyotakeshi.Bridge2;

import java.util.List;

// Abstraction = 機能クラスのスーパークラス
public class Display {

    private final DbImpl impl;

    // Implementer = 実装クラス のスーパークラスを
    // 保持するために constructor injection
    // impl フィールドが橋渡しとなっている
    public Display(DbImpl impl) {
        super();
        this.impl = impl;
    }

    public List<Employee> getEmployeeList() {
        // 実装クラスの interface に変換 = 委譲(ある意味、たらい回し)
        impl.connect();
        List<Employee> employeeList = impl.findAllEmployee();
        impl.close();

        return employeeList;
    }

    public void showEmployeeList() {
        List<Employee> employeeList = this.getEmployeeList();

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();
    }
}
