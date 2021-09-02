package com.kiyotakeshi.AbstractFactory.factory.linux;

import com.kiyotakeshi.AbstractFactory.factory.OsFileSystem;

public class LinuxFileSystem implements OsFileSystem {

    @Override
    public String getFileSeparator() {
        return "/";
    }

    @Override
    public String getRootPath() {
        return "/";
    }

    @Override
    public void saveFile(String fileName) {
        String directory = getRootPath() + "usr" + getFileSeparator() + fileName;
        // 実際にファイルには保存しない
        System.out.println("save: " + directory);
    }
}
