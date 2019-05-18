# Java言語で学ぶデザインパターン入門

## 01.Iterator  
対象に依存せずIterateできる。  
Iterateの順序などカスタムできる。

## 02.Adapter
既存Adapteeに一切手を加えずに流用できる。  
既存クラスの使用さえ分かれば作れるし、再テストせずに済む。

## 03.Template Method
親クラスで処理の枠組みを定め、サブクラスで実装する。

## 04.Factory Method
直接インスタンス生成せずFactoryのメソッドによってインスタンスを生成して返す。  
インスタンス生成にTemplate Methodを使う。

## 05.Singleton
特定クラスのインスタンスを1個に制限する。  
N個に制限するなど応用もある。

## 06.Prototype
インスタンスから別のインスタンスを作り出す。  
複雑なインスタンス生成工程を省く。

## 07.Builder
複雑なインスタンスを、メソッドを用いて組み上げる。  
Builderはサブクラスの組み立てに必要なメソッドを網羅する必要がある。

## 08.AbstractFactory
抽象的な工場と部品の組み合わせを定義して、具体的な実装を設計する。  
ConcreteFactoryの追加は簡単。何を実装すればいいか明らか。  
部品の追加は困難。関連する全ての向上を改修する必要がある。

## 09.Bridge
機能のクラス階層と実装のクラス階層を分離して橋渡しする。  

