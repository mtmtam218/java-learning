//CharStringLiteralExample.java
//文字と文字列リテラル

public class CharStringLiteralExample{
  public static void main(String[] args){

    //1文字だけ使いたいときには、「シングルクォーテーション（ ' ）」で囲む
    char letter = 'a';

    //文字がいっぱい並んだものは「ダブルクォーテーション（ ” ）」で囲む
    //文字が0個でもOK（つまり "" もOK！）
    String word = "abc";

    System.out.println("char=" + letter);
    System.out.println("String" + word);
  }
}
