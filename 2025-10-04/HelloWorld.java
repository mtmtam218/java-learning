//HelloWorld.java
//mainメソッドの基本

//まずはじめに 「アクセス修飾子 class クラス名」と記述し、中括弧｛｝で囲む
//クラス名は基本英語
public class HelloWorld {
  
  //HelloWorldクラスの中にある main のブロックをmainメソッド と呼ぶ
  //mainメソッドは必ず「public static void main(String[] args)」という形式で記述する決まりになっている
  public static void main(String[] args){

    //HelloWorldクラスの処理はSystem.out.println()を実行するという意味
    System.out.println("Hello World");
  }
}
