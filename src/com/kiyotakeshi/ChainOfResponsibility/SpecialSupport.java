package com.kiyotakeshi.ChainOfResponsibility;

// ConcreteHandler
public class SpecialSupport extends Support {

    private final int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            // TODO: trouble に対する対処
            return true;
        } else {
            return false;
        }
    }
}
