package com.kiyotakeshi.ChainOfResponsibility;

// ConcreteHandler
public class LimitSupport extends Support {
    private final int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            // TODO: trouble に対する対処
            return true;
        } else {
            return false;
        }
    }
}
