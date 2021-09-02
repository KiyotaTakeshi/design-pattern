package com.kiyotakeshi.AbstractFactory.factory.linux;

import com.kiyotakeshi.AbstractFactory.factory.OsDisplaySystem;

// ConcreteProduct
public class LinuxDisplaySystem implements OsDisplaySystem {

    @Override
    public void displayOsName() {
        System.out.println("+++ Linux +++");
    }

    @Override
    public void displayStr(String str) {
        System.out.println("+++" + str + "+++");
    }
}
