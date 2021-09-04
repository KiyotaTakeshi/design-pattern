package com.kiyotakeshi.Bridge2;

public class PostgreSqlImpl extends DbImpl {
    @Override
    public void connect() {
        System.out.println("connect to PostgreSQL");
    }

    @Override
    public void close() {
        System.out.println("close to PostgreSQL");
    }
}
