package com.kiyotakeshi.ChainOfResponsibility2;

// Handler
// 要求を処理するインターフェース
public abstract class ApprovalPerson {

    private String name;

    // 次の人(たらい回しにする人)を保持
    // 次の人も Handler型
    private ApprovalPerson next;

    public ApprovalPerson(String name) {
        this.name = name;
    }

    public ApprovalPerson setNext(ApprovalPerson next) {
        this.next = next;
        return next;
    }

    // template method pattern
    public final void decision(DecisionRequest request) {
        if (judge(request)) {
            done(request);
        } else if (next != null) {
            next.decision(request);
        } else {
            fail(request);
        }
    }

    protected abstract boolean judge(DecisionRequest request);

    protected void done(DecisionRequest request) {
        System.out.println(request + " is decisioned by " + name);
    }

    protected void fail(DecisionRequest request) {
        System.out.println(request + " is not decisioned");
    }
}
