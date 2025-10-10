//DataTypesOverview.java
//データ型(=箱の種類)について
//箱にも段ボールや厚紙製の箱、プラスチック製の箱など色々な種類があるのと同じ感じ
//段ボールに水を入れると漏れるように、整数型の箱に文字列を入れると「箱の種類」と「中身」が合わず、コンパイルエラーになる
//扱える値の範囲＝箱の大きさというイメージ
//例えば、byte型は「−128〜127」までの整数を入れられるが、1000のように範囲を超える値を入れると、すべて入りきらずコンパイルエラーになる

public class DataTypesOverview{
  public static void main(String[] args){
    //整数用の箱（プリミティブ）
    byte b = 100; //-128 〜 127の値が扱える箱
    short s = 30000; //-32,768 〜 32,767の値が扱える箱
    int i = 2_147_483_647; //約 -21億 〜 +21億の値が扱える箱で、基本これ
    long L = 9_000_000_000L; //約 -9京 〜 +9京の値が扱える箱 //longはLを付ける

     //小数の箱（プリミティブ）
    float f = 3.14f; //±3.4×10³⁸（7桁くらい正確） //floatはf/F必須
    double d = 3.1415926535; //±1.7×10³⁰⁸（15桁くらい正確）で、基本これ

    //真偽（プリミティブ）
    boolean ok = true; //true ( 真 ) or false ( 偽 ) 真偽を測る箱

    //文字（プリミティブ）
    char ch = '虹'; //\'あ\' 、 \'虹\' などの一文字を扱える箱

    //文字列（参照型：クラス）
    String msg = "Java学習中"; //java、勉強、Mac などの複数の文字を扱える箱

    System.out.println("byte=" + b);
    System.out.println("short=" + s));
    System.out.println("int=" + i);
    System.out.println("long=" + L);
    System.out.println("float=" + f);
    System.out.println("double=" + d);
    System.out.println("boolean=" + ok);
    System.out.println("char=" + ch);
    System.out.println("String=" + msg);
    
  }
}
