//DataTypeExample.java
//データ型と参照型

public class DataTypeExample {
  public class void static main(String[] sregs) {

    //整数型

    //-128 ～ 127 までの整数を取り扱える箱
    //ファイルデータ、画像データ、通信データなど、小さい整数のときに使う
    //省メモリ重視
    byte b = 100;

    //-32768 ～ 32767 までの整数を取り扱える箱
    //昔の機器やゲーム機なその、限られたメモリの環境で使われる
    //メモリを節約したいけど、byteでは足りない時
    short s = 30000;

    //-2147483648 ～ 2147483647 までの整数を取り扱える箱
    //普段の整数はほとんどこれ
    //扱いやすくスピードと範囲のバランスが良い
    int i =2147483647;

    //-92223372036854775808 ～ 9223372036854775807 までの整数を取り扱える箱
    //intに入り切らない大きな数を扱う時に使う
    //範囲がとても広いがメモリも多く使うので、必要なときにだけ使うのがベスト
    long l = 9223372036854775807L;

    //少数
    float f = 3.14f;
    double d = 1.23456789;

    //真偽値
    //true ( 真 ) or false ( 偽 ) 真偽を測る箱
     boolean isJavaFun = true;

    //文字と文字列
    //一文字を扱える箱
    char c = '虹';

    //java、勉強、Mac などの複数の文字を扱える箱
    String str = "Javaは楽しい！";

    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("boolean: " + isJavaFun);
    System.out.println("char: " + c);
    System.out.println("String: " + str);
  }
}
