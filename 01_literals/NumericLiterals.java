//数値リテラル

public class NumericLiterals {
  public static void main(String[] args){
    //整数リテラル（10進数、2進数、8進数、16進数）
    int dec = 100; //10進数（0~9を使用）
    int bin = 0b1100100; //2進数（0~1を使用、先頭に0bまたは0Bを付与）
    int oct = 0144; //8進数（0~7を使用、先頭に0を付与）
    int hex = 0x64; //16進数（0~9、A~E (a~e)を使用、先頭に0xまたは0Xを付与）

    long longNum = 100L; //Long型の整数リテラル

    //浮動小数点リテラル
    double d = 3.1415; //double型
    double e = 31415e-4; //指数表記
    float f = 3.14f; //float型

    //数理リテラルのアンダースコア
    int num = 1_000_000; //可読性を高める
    System.out.println(num);
  }
}
