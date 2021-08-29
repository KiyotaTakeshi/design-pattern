package com.kiyotakeshi.Adaptor;

public class PrintBanner implements Print {
    // has-a(あるクラスが別のクラスのフィールドとして利用している関係)
    // PrintBanner has a Banner
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
