package com.kiyotakeshi.ChainOfResponsibility;

// Handler
// 要求を処理するインターフェース(API)を定める
public abstract class Support {

    private String name;

    // 次の人を所持しておき、自分で処理できない場合はたらい回しにする
    // 次の人も Handler
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // template method pattern
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    // 別パッケージのクラスからトラブルの解決を依頼するときは、 support を使ってもらうため protected
    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
