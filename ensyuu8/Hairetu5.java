package ensyuu8;

public class Hairetu5 {
  public static void main(String[] args) {
    //整数値リスト
    int[] array= {1, 2, 3, 4, 5};
    int sum = 0; //合計値
    
    //合計値を表示
    for (int i = 0; i < array.length ;i++){
        sum += array[i];
    }

    //合計を出力
    System.out.println("合計値は" + sum + "です。");

    //平均を出力
    System.out.println("平均値は " + (sum / array.length) + "です。");
  }
    
}
