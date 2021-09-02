package com.kiyotakeshi.AbstractFactory.factory;

public interface OsFileSystem {
    // ファイルセパレーターを取得
    public String getFileSeparator();

    // ルートパスを取得
    public String getRootPath();

    // ファイルを保存
    public void saveFile(String fileName);
}
