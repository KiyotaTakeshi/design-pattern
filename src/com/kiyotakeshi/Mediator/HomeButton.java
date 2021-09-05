package com.kiyotakeshi.Mediator;

// ConcreteColleague
// 他の ConcreteColleague とやり取りする際は、 Mediator を介する
public class HomeButton implements Button {

    private Mediator mediator;

    private boolean enable;

    public HomeButton(boolean enable, Mediator mediator) {
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
            mediator.consulting(Mediator.HOME_PRESS);
        } else {
            System.out.println("HomeButton is already active");
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
