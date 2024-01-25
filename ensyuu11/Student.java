package ensyuu11;
import java.util.List;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    
    String a;
    String b;
    String result;

    //名前、学生番号、平均点のデータをそれぞれ格納する３種類のリスト
    List<String> name = new ArrayList<>();
    List<String> number = new ArrayList<>();
    List<Double> average = new ArrayList<>();

    void Name(String a){
      name.add(a);
    }

    void Number(String b){
      number.add(b);
    }

    void Average(int c, int d, int e){
      double ave = (c + d + e) / 3;
      average.add(ave);
    }
    
    void Hyouji(int s){
      for (int f = 1; f <= s; f++){
        int k = f - 1;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        double ave2 = average.get(k);
        result = df.format(ave2);
        System.out.print(number.get(k) + "番  ");
        System.out.print(name.get(k) + "さん  ");
        System.out.println("平均点" + average.get(k));
         
      }
    }
}
