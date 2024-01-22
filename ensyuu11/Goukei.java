package ensyuu11;

public class Goukei {
   //クラス変数x,yを設定
   public static int x = 100;
   public static int y = 200;
   public static int total = 0;
   
   //x,yの二つの変数からxからyまでの合計値を求めて結果を返すTotal
   public static void Total(int x,int y){
    for (int c = x; c <= y; x++){
        total += c;
       c += 1;
    }
    return;
   }
}
