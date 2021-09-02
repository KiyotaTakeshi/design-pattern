package com.kiyotakeshi.AbstractFactory.factory.windows;

import com.kiyotakeshi.AbstractFactory.factory.OsFileSystem;

public class WindowsFileSystem implements OsFileSystem {

    @Override
    public String getFileSeparator() {
        return "\\";
    }

    @Override
    public String getRootPath() {
        return "C:\\";
    }

    @Override
    public void saveFile(String fileName) {
        String directory = getRootPath() + "work" + getFileSeparator() + fileName;
        System.out.println("save: " + directory);
    }
}
