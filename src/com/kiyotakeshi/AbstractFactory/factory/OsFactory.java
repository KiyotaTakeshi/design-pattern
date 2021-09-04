package com.kiyotakeshi.AbstractFactory.factory;

// AbstructFactory
public abstract class OsFactory {

    // ConcreteFactory のインスタンスを生成
    // static method なのでインスタンス化しなくても呼び出せる
    public static OsFactory getFactory(String className) {

        OsFactory factory = null;

        try {
            // Class.forName(className).newInstance() でインスタンスの生成(引数なしコンストラクタが呼ばれる)
            // className -> "com.example.factory.linux.LinuxFactory"
            // Class.forName(className).newInstance() -> LinuxFactory@28
            // ある Class オブジェクトを受け取った際に、 Class クラスを使って動的にメソッド呼び出しを行うことをリフレクションと呼ぶ
            factory = (OsFactory) Class.forName(className).newInstance();

            // class として用意していないものを指定してもインスタンスの生成に失敗する
            // Class.forName("com.example.factory.linux.Dummy").newInstance()
            // -> Cannot evaluate because of org.eclipse.debug.core.DebugException: com.sun.jdi.InvocationException: Exception occurred in target VM occurred invoking method.

        } catch (ClassNotFoundException e) {
            System.out.println("Can't find " + className);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    // FileSystem生成用メソッド
    public abstract OsFileSystem createFileSystem();

    // DisplaySystem生成用メソッド
    public abstract OsDisplaySystem createDisplaySystem();
}
