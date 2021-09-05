package com.kiyotakeshi.Mediator;

public interface Mediator {

    // interface だと public static final は省略可能
    // public static final int HOME_PRESS = 1;
    int HOME_PRESS = 1;
    int APPLICATION_PRESS = 2;

    void consulting(int code);
}
