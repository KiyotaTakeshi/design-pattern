package com.kiyotakeshi.Mediator;

// ConcreteMediator
public class Screen implements Mediator {

    // Colleague オブジェクトを持つ
    private Button homeButton;

    private Button applicationButton;

    public Screen() {
        homeButton = new HomeButton(false, this);

        // アプリのボタンが有効な状態でインスタンスを生成
        applicationButton = new ApplicationButton(true, this);
    }

    // 各ボタン(ConcreteColleague)の相談を受け付けるメソッド
    // ボタン同士が関連することがなくなり、独立性と再利用性が上がる
    @Override
    public void consulting(int code) {
        switch (code) {
            case Mediator.HOME_PRESS:
                System.out.println("Go to Home");
                homeButton.setEnable(false);
                applicationButton.setEnable(true);
                break;
            case Mediator.APPLICATION_PRESS:
                System.out.println("Start Application");
                applicationButton.setEnable(false);
                homeButton.setEnable(true);
                break;
            default:
                break;
        }
    }

    public Button getHomeButton() {
        return homeButton;
    }

    public Button getApplicationButton() {
        return applicationButton;
    }

    @Override
    public String toString() {

        String result = null;

        if (!homeButton.isEnable()) {
            result = "display Home";
        } else if (!applicationButton.isEnable()) {
            result = "display Application";
        }

        return result;
    }
}
