package kougi;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Kouka {
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      //点数を保存するための空のリスト
      List<Integer> list = new ArrayList<>();
      //5回点数を入力させるfor文
      for (int c = 1; c <= 5; c++){
          int a = c;
          System.out.print(a +"教科目の点数を入力してください:");
          int score = stdIn.nextInt();
          if((score >= 0) && (score <= 100)){
            list.add(score);
          }
          else {
            System.out.println("不正な点数を検知しました。0点とします。");
            list.add(0);
          }
      }
      int total = 0;
      for (int i = 0; i < list.size(); i++){
        int s = list.get(i);
        total += s;
      }
      System.out.println("合計点 = " + total);

      double heikin = 0;
      heikin = total / list.size();
      System.out.println("平均点 = " + heikin);
    }
}
