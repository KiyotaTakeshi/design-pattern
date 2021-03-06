## [最新の GoF パターン](https://www.informit.com/articles/article.aspx?p=1404056)

- 削除されたもの
  - singleton, Adapter, Bridge, Chain of Responsibility, Memento, Observer

```
These were the categories:

Core: Composite, Strategy, State, Command, Iterator, Proxy, Template Method, Facade

Creational: Factory, Prototype, Builder, Dependency Injection

Peripheral: Abstract Factory, Visitor, Decorator, Mediator, Type Object, Null Object, Extension Object

Other: Flyweight, Interpreter
```

## 雑多なメモ

- 「持っている関係(has-a)」のことを集約という

```java
class Color {
	// ...
}

// Fruit クラスの color フィールドは Color クラス型のため集約
class Fruit {
	Color color;
}
```

- デザインパターンの目標の一つはプログラミングを再利用可能にすること
    - どうやってプログラムを部品として再利用するかを考えている

- プログラムを「完成品としてみない」
    - 「今後拡張していくもの、変更を加えていくもの」としてみる

- クラス階層について考える時に、スーパークラス視点で考える
  - スーパークラスで抽象メソッドを宣言する場合
    - サブクラスがそのメソッドを実装することを期待する(要請する)

- サブクラスにはスーパークラスで宣言されている抽象メソッドを実装するという責任が生じる = subclass responsibility

- デザインパターンを理解するためには、クラスやインターフェースの相互関係に目を向ける
  - 複数のクラスやインターフェースが個々の役割を持ち、互いに関連しながら動作するため
    - 白雪姫が1人だと劇は成立しない

---
## 各パターンの要約

- Iterator の本質は「背後の構造を意識させずに1つずつ取り出せるという抽象化」

- Adapter(Wrapper) の本質は「すでに提供されているものと必要なもののズレを埋めること」
  - 異なるインターフェースを持つクラス同士をつなぐ
  - テストされ実績が十分でバグの少ない、すでに存在しているクラスを再利用する時に使う
    - 新しいインターフェース(API)に適合させようとする時、既存のソースを修正しようと考えてしまう
    - 既存のものを修正する場合は、もう一度テストが必要になる
    - ***テストコードがあり適切にテストができるなら影響範囲によっては既存のものを修正しても良さそう***

- Template Method の本質は「処理の順序と実装の分離」
  - スーパークラス(抽象クラス)で処理の枠組みを定め、サブクラスでその具体的内容を定める

- Factory Method(Virtual Constructor) の本質は「インスタンスを生成のための枠組みと実際のインスタンス生成の分離」
  - インスタンス生成に Template Method パターンを利用したもの
  - 枠組みに関するパッケージは、実際に生成するパッケージに依存しない
  - 保守する人のために、コメント等に使用してるデザインパターン名や意図を記載しておく(Template Method パターンも)
    - 1つのクラスでは動作がわからない作りとなるため
    - スーパークラスで動作の骨組みを理解し、抽象メソッドを実装しているクラスのコードを読む必要がある

- Singleton の本質は「インスタンスが1つしか存在しないことの保証」
  - 現代の文脈で見直した際に削除された
    - 実質的にはグローバル変数で便利さより副作用が上回る
      - 何かを入れて、別のところで取り出すので悪しきグローバル変数と同じ
      - メソッド内で Singleton のインスタンスを探して使うとスコープが突然広がり、意識しないといけない物が増える(無関係に思えるところに依存関係が生じる)
      - Singleton の状態をリセットしないとテストコード間にも依存関係が生まれる
    - プロセスの中で単一にしても、複数のサーバ(VM)に対してリクエストする時代なので意味がない

- Prototype の本質は「クラスからではなく、インスタンスをコピーして新しいインスタンスを生成する」

- Builder の本質は「構造を持ったインスタンスを段階的に組み上げていくこと」
  - Builder interface では構成するための抽象メソッドを書く
  - Director クラスは Builder のインターフェース(API)をつかってインスタンスを生成する
    - ただし ConcreteBuilder に依存したプログラミングは行わない
  - Client(Main クラス等)は Builder interface のメソッドは知らず、 Director クラスのメソッドを呼び出す

- Abstract Factory の本質は「インターフェースだけを使って部品を組み立てること」
  - **抽象的とは具体的にどのように実装されているかについては考えずに、インターフェース(API)だけに注目している状態**
  - 部品が複数存在するケース、拡張する可能性があるケース、実行環境が複数あるケースで使用する

- Bridge の本質は「機能クラスと実装クラスの橋渡し」
  - 継承と実装の違い
    - 継承(機能クラス)は、サブクラスで新たな機能を追加する
        - 機能とはサービス(提供されるメニューのようなもの)のこと
        - **機能を呼び出す側は中でどのような処理をしているかは気にしない = 実装は知らない**
    - 実装(実装クラス)は、サブクラスでスーパークラスが規定しているインターフェース(API)を実装する
      - 実装はサービスを実現するための具体的な処理のこと
  - 機能クラスと実装クラスを独立したクラス階層に分けて、それらの橋渡しを行うのが Bridge
  - 機能と実装の結合を緩やかにしたい場合、それぞれを拡張可能にする場合に使用する
  - **機能の階層に実装を書くことも可能なので、開発者全員に周知しないとすぐに破綻する**

- Strategy(Policy) の本質は「アルゴリズムの切り替え」
  - アルゴリズムとそれを利用するインターフェース(API)である context を意識的に分離する
  - context では委譲によってアルゴリズムを実行する
  - アルゴリズムを追加、変更、切り替えが委譲による緩やかな結びつきのため容易に行える
  - 実行環境に応じてアルゴリズムを変える、複数のアルゴリズムで、片方の結果があっているかを検算するなどの使い方も
  
- Composite の本質は「容器と中身を同じ種類のものとして扱い、再帰的な構造を作ること」
  - 容器の中には、中身を入れてもいいし、更に容器を入れても良い
  - ディレクトリもファイルも同一視して(ディレクトリエントリ)、ディレクトリの中に入れることができる
  - **複数と単数の同一視とも呼べる(複数個のものをあたかも1つのものであるかのように取り扱う)**
  - ファイルシステム、ウィンドウシステム、箇条書き、HTMLのリストなど
  - **ツリー構造のオブジェクトを表現したい、それらに再帰的な処理を行いたい場合に利用する**

- Decorator(Wrapper) の本質は「クラスの組み合わせを変えて機能の追加を行うこと」
  - 機能ごとにクラスを用意し、その組み合わせを変えることで必要な機能を提供する

- Visitor の本質は「データ構造と処理の分離」
  - データ構造の中を巡り歩く主体である訪問者を表すクラスを用意し、そのクラスに処理を任せる
    - 家事代行が様々な家に訪問して家に合わせたメニューの家事を行うイメージ
  - ConcreteVisitor, ConcreteElement の組み合わせによって処理の内容が決まる = ダブルディスパッチ
  - Composite pattern より複雑な分、処理の追加、変更が容易
    - 新しい処理を追加したい場合は、新しい訪問者(ConcreteVisitor)を追加する(データ構造側は訪問者を受け入れてあげればいい)
  - **OCP(The Open-Closed Principle) は拡張に対しては open で、修正に対しては closed であるべきという考え**
    - 拡張を許すように作りつつ、拡張するたびに既存のクラスを修正しないで良いようにする
    - ConcreteVisitor の拡張、追加は容易
    - String クラスは Java の基本クラスとして拡張されないという前提で最適化を行っているため、 final で宣言されている 
      - `public final class String implements java.io.Serializable, Comparable<String>, CharSequence {`
  
- Chain of Responsibility の本質は「要求する側と処理する側の結びつきを弱める」
  - たらい回しにより目的のオブジェクトを決定する
  - 要求を出す人が、処理するものの役割分担の詳細まで知らないといけないのでは、部品としての独立性が低い
  - ConcreteHandler を組み替えることで処理の順序を変えられる
  - 処理は遅くなるため、誰が要求を処理するか決めっていて変わることがないなら、このパターンは使わない

- Facade の本質は「システムの外側にはシンプルなインターフェースを見せることで複雑なものを単純に見せる」
  - 処理を行うための窓口を用意して、そこに対して要求を出すこと
  - フランス語が語源で、「建物の正面」を指す
  - インターフェース(API)を少なくすることで client がどれを使ったらよいかわかる

- Mediator の本質は「複数オブジェクト同士が関連しあっている場合の制御を相談役が一手に引き受けること」
  - 仲介者、相談役の意味で、相談役1人のみにやりとりをすること
  - 多数のオブジェクト間で調整を行わないといけない場合に有効
  - **多対多の関係だったオブジェクトを 1:N の関係にできる**
  - Mediator は双方向で Facade は一方向

- Observer の本質は「」

- Memento の本質は「」

- State の本質は「」

- Flyweight の本質は「」

- Proxy の本質は「」

- Command の本質は「」

- Interpreter の本質は「」


