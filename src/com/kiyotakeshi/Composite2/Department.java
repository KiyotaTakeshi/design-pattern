package com.kiyotakeshi.Composite2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// composite
public class Department extends Unit {

    private final String name;
    private List<Unit> departmentList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);

        Iterator<Unit> it = departmentList.iterator();
        while (it.hasNext()){
            Unit unit = it.next();
            // 再帰的呼び出し
            unit.printList(prefix + "/" + this.name);
        }
    }

    @Override
    protected void add(Unit unit) {
        departmentList.add(unit);
    }
}
