package com.kiyotakeshi.Visitor5;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            Unit sales1U = new Department("Sales_1U");
            Unit sales1USection1 = new Group("section_1");
            Unit sales1USection2 = new Group("section_2");

            sales1U.add(sales1USection1);
            sales1U.add(sales1USection2);

            Unit sales2U = new Department("Sales_2U");
            Unit sales2USection1 = new Group("section_1");
            Unit sales2USection2 = new Group("section_2");

            sales2U.add(sales2USection1);
            sales2U.add(sales2USection2);

            Unit department = new Department("Sales");
            department.add(sales1U);
            department.add(sales2U);

            department.accept(new ListVisitor());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
