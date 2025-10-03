//EscapeTextBlockExample.java
//エスケープとテキストブロック

public class EscapeTextBlockExample{
  public static void main(String[] args){

    //エスケープシーケンス
    //文字列や文字リテラルの中で「そのまま書くと意味が変わっちゃう記号」や「特別な動作」を書きたいときに使用
    System.out.println("Hello\World"); //改行（\n）
    System.out.println("She said \"Java is fun!\""); //ダブルクォーテーション " をそのまま文字として書く（\"）
    System.out.println('\''); //シングルクォーテーション ' をそのまま文字として書く(\')

    //Unicodeエスケープ
    //（\u）に続けて16進数4桁を書くと、その番号に対応する文字を表すことができる
    //つまり「世界中の文字」をコード番号で直接書く方法
    char c = '\u0061'; // 'a'（U+0061 がアルファベットの a の文字コード）
    System.out.println("Unicode a = " + c);

    // テキストブロック（Java 15以降）
    String textBlock = """
      「 """（ダブルクォーテーションを３つ） 」で囲んだ範囲が
      複数の複数行の文字列リテラルとして
      扱うことが出来る！！！
      """;
    System.out.println(textBlock);
  }
}
