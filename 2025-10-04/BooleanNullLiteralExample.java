//BooleanNullLiteralExample.java
//真偽値とnull

public class BooleanNullLiteralExample{
  public static void main(String[] args){
    boolean flagTrue = true; //真はtrueで表現
    boolean flagFalse = false; //偽はfalseで表現

    String text = null; // 何も参照していない

    System.out.println("flagTrue=" + flagTrue);
    System.out.println("flagFalse=" + flagFalse);
    System.out.println("text=" + text);　//nullと出力される
  }
}
