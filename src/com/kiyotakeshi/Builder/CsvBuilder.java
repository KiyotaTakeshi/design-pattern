package com.kiyotakeshi.Builder;

import java.util.List;

// ConcreteBuilder
public class CsvBuilder implements Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeHeader() {
        sb.append("name, age, department\n");
    }

    @Override
    public void makeEmployeeList(List<Employee> employeeList) {
        for (Employee employee: employeeList){
            sb.append(employee.getName()).append(",");
            sb.append(employee.getAge()).append(",");
            sb.append(employee.getDepartment()).append("\n");
        }
        // 改行コードを消す
        sb.substring(0, sb.length() -1);
    }

    public String getResult(){
        return sb.toString();
    }
}
