package com.kiyotakeshi.Mediator;

// ConcreteColleague
// 他の ConcreteColleague とやり取りする際は、 Mediator を介する
public class ApplicationButton implements Button {

    private boolean enable;
    private Mediator mediator;

    public ApplicationButton(boolean enable, Mediator mediator) {
        this.enable = enable;
        this.mediator = mediator;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 各ボタンは押された時に mediator に相談する
    @Override
    public void press() {
        if (enable) {
            mediator.consulting(Mediator.APPLICATION_PRESS);
        } else {
            System.out.println("ApplicationButton is already active");
        }
    }

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
