//NumericLiteralExample.java
//数値リテラル = プログラムの中で「数字をそのまま書いたもの」のこと
//数値リテラルのデフォルトはint型

public class NumericLiteralExample　{
  public static void main(String[] args)　{

    /*decimal（デシマル＝10進数）
      普段の算数の数え方
      0～9の10種類の数字を使う
      decimal = 100; は普通の100
      */
    int decimal = 100; 

    /*binary（バイナリ＝2進数）
      コンピュータが大好きな0と1の2種類しか使わない数え方
      0b1100100 を2進数で読むと、10進数で「100」
      */
    int binary = 0b1100100;

    /*octal（オクタル＝8進数）
      8を基準にした数え方
      0〜7の8種類の数字を使う
      0144 を8進数で読むと、10進数で「100」
      */
    int octal = 0144; 

    /*hex（ヘックス＝16進数）
      16を基準にした数え方
      0〜9と A(10), B(11), C(12), D(13), E(14), F(15) を使う
      0x64 を16進数で読むと、10進数で「100」
      プログラムや色指定でよく使う書き方（16個ごとに繰り上がる）
      */
    int hex = 0x64;

    /*Long型 (= もっと大きな整数用（-9,223,372,036,854,775,808 〜 9,223,372,036,854,775,807）)
    intだと「約21億」までしか扱えないけど、long は「約900京」まで可能
    天文学的な数や大きなID番号を扱うときに必要になる
      */
    long bigNumber = 100L;

    //Javaでは整数リテラルはデフォルトでint型が扱われる
    int a = 100; //OK
    long b = 100; //OK(intの100がLongに変換される)

    //でも、もし「intの限界を超える数字」を書くと
    long big = 3000000000; //←エラーになる（intに入り切らないから）

    //このときにLをつけて「これはLongだよ～」と教えることで指定できる
    long big = 3000000000L;

    /*浮動小数点リテラル(= 小数点を含む数値)
      デフォルトはdouble型（ダブル）
      64ビットの小数でより精度が高い小数を扱える
      */
    double pi = 3.14; 

    /*f をつけると float型（フロート）
      double よりも軽くて、精度は低い（32ビット）
      */
    float pi = 3.14f;  // OK
    float x = 3.14;    // ← エラー（doubleをfloatに代入しようとして失敗）
    
    /*アンダースコア
      大きな数字を読みやすくするために、桁の区切りに アンダースコア _ を使える
      計算や値には一切影響しない
      */
    int num = 1_000_000;   // 1000000 と同じ（100万）
    long card = 1234_5678_9012_3456L; // クレジットカード番号みたいに区切れる

    System.out.println("decimal=" + decimal);
    System.out.println("binary=" + binary);
    System.out.println("octal=" + octal);
    System.out.println("hex=" + hex);
    System.out.println("bigNumber=" + bigNumber);
    System.out.println("pi=" + pi);
    System.out.println("sci=" + sci);
    System.out.println("f=" + f);
    System.out.println("million=" + million);
  }
}
