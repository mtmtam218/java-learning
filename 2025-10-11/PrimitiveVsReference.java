//PrimitiveVsReference
//プリミティブ vs 参照

public class PrimitiveVsReference{
  public static void main(String[] args){
    //プリミティブは「値そのもの」を保持
    int a = 10; //aという箱を作って、10を入れた（a→10）
    int b = a; //bという箱を作って、aの値（10）をコピーしていれた（b→10）値をコピーしただけだからa=bではない
    a = 99; //aという箱の中身を99に入れ替えた（a→99、b→10）
    System.out.println("a=" + a + ", b=" + b); // 99, 10

    //参照型はメモリのアドレス（＝場所）
    int[] arr1 = {1,2,3}; //配列をつくった
    int[] arr2 = arr1; //arr1の「住所」をそのままコピー(=arr2 も 同じ場所)
    arr1[0] =999; //arr1の1つ目の部屋を999に変えた
    System.out.println("arr2[0]=" + arr2[0]);  // 999（同じ箱を共有）
  }
}
