package com.kiyotakeshi.AbstractFactory.factory.windows;

import com.kiyotakeshi.AbstractFactory.factory.OsDisplaySystem;
import com.kiyotakeshi.AbstractFactory.factory.OsFactory;
import com.kiyotakeshi.AbstractFactory.factory.OsFileSystem;

public class WindowsFactory extends OsFactory {

    @Override
    public OsFileSystem createFileSystem() {
        return new WindowsFileSystem();
    }

    @Override
    public OsDisplaySystem createDisplaySystem() {
        return new WindowsDisplaySystem();
    }
}
