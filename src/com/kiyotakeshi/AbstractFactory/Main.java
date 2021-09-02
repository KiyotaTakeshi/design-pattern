package com.kiyotakeshi.AbstractFactory;

import com.kiyotakeshi.AbstractFactory.factory.OsDisplaySystem;
import com.kiyotakeshi.AbstractFactory.factory.OsFactory;
import com.kiyotakeshi.AbstractFactory.factory.OsFileSystem;

public class Main {
    public static void main(String[] args) {

//         String className = "com.kiyotakeshi.AbstractFactory.factory.windows.WindowsFactory";
        String className = "com.kiyotakeshi.AbstractFactory.factory.linux.LinuxFactory";
        OsFactory factory = OsFactory.getFactory(className);

        // Main からは Windows か Linux かは意識せずにメソッドを呼び出す
        OsDisplaySystem displaySystem = factory.createDisplaySystem();
        displaySystem.displayOsName();
        displaySystem.displayStr("sample");

        OsFileSystem fileSystem = factory.createFileSystem();
        fileSystem.saveFile("sample.txt");
    }
}
