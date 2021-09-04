package com.kiyotakeshi.Strategy;

import java.util.ArrayList;
import java.util.List;

// Context
// Strategy を利用したAPIを提供するクラス
public class SearchApi {

    private final Strategy strategy;
    private static List<Employee> employeeList = new ArrayList<>();

    // static initializer は呼び出されたタイミングで一度だけ実行される
    static {
        for(int i = 0; i < 10000; i++){
            Employee employee = new Employee(i, "user" + i);
            employeeList.add(employee);
        }
    }

    // ConcreteStrategy を constructor injection でもつ
    // 引数としては interface である Strategy 型
    public SearchApi(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    // 引数無しで呼ばれた場合にデフォルトで使用する strategy を設定することも
    public SearchApi() {
        super();
        this.strategy = new BinaryStrategy();
    }

    public Employee searchEmployee(int id){
        // 委譲を使用して ConcreteStrategy に処理を投げる
        // strategy filed に setter をつくれば、アルゴリズムを途中で変えることもできる
        Employee employee = strategy.search(employeeList, id);

        return employee;
    }
}
