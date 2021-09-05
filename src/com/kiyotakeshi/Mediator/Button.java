package com.kiyotakeshi.Mediator;

// Colleague
// Mediator と通信行うインターフェースを定める
public interface Button {

    void setMediator(Mediator mediator);

    void press();

    boolean isEnable();

    void setEnable(boolean enable);
}
