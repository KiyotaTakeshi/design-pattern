package com.kiyotakeshi.AbstractFactory.factory.linux;

import com.kiyotakeshi.AbstractFactory.factory.OsDisplaySystem;
import com.kiyotakeshi.AbstractFactory.factory.OsFactory;
import com.kiyotakeshi.AbstractFactory.factory.OsFileSystem;

// ConcreteFactory
public class LinuxFactory extends OsFactory {

    // 戻り値の方が interface なので、 LinuxFileSystem はその実装
    @Override
    public OsFileSystem createFileSystem() {
        return new LinuxFileSystem();
    }

    @Override
    public OsDisplaySystem createDisplaySystem() {
        return new LinuxDisplaySystem();
    }
}
