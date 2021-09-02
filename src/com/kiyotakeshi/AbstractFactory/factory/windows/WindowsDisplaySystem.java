package com.kiyotakeshi.AbstractFactory.factory.windows;

import com.kiyotakeshi.AbstractFactory.factory.OsDisplaySystem;

public class WindowsDisplaySystem implements OsDisplaySystem {

    @Override
    public void displayOsName() {
        System.out.println("==================");
        System.out.println("Windows");
        System.out.println("==================");
        System.out.println();
    }

    @Override
    public void displayStr(String str) {
        System.out.println("==================");
        System.out.println(str);
        System.out.println("==================");
        System.out.println();
    }

}