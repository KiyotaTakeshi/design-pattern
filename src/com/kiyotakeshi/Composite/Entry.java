package com.kiyotakeshi.Composite;

// Component
// Leaf, Composite を同一視するためのもの(ディレクトリエントリを表現)
public abstract class Entry {

    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    // ディレクトリエントリを追加する
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    // public なものは、引数無しでしか呼べないようにする
    public void printList() {
        printList("");
    }

    // サブクラスが呼び出すためのもの
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        // getName, getSize() は file, directory でそれぞれのものが呼ばれる
        return getName() + " (" + getSize() + ")";
    }

    public String getFullName() {
        StringBuffer fullName = new StringBuffer();
        Entry entry = this;

        fullName.insert(0, "/" + entry.getName());

        entry = entry.parent;
        while (entry != null) {
            fullName.insert(0, "/" + entry.getName());
            entry = entry.parent;
        }
        return fullName.toString();
    }
}
