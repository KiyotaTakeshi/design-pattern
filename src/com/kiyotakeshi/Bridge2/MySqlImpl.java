package com.kiyotakeshi.Bridge2;

public class MySqlImpl extends DbImpl {
    @Override
    public void connect() {
        System.out.println("connect to MySQL");
    }

    @Override
    public void close() {
        System.out.println("close to MySQL");
    }
}
