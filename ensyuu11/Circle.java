package ensyuu11;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circle {
    double PI = 3.1415; 
    int hankei;
    double ensyuu;
    double menseki;
    String result;
    
    //円周を求めるインスタンスメソッド
    void Ensyuu(int hankei, double PI){
        this.PI = PI;
        this.hankei = hankei;
        ensyuu = hankei * 2 * PI;
        return;
    }
    
    //面積を求めるインスタンスメソッド
    void Menseki(int hankei, double PI){
        this.PI = PI;
        this.hankei = hankei;
        menseki = hankei * hankei * PI;
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.DOWN);
        result = df.format(menseki);
        return;
    }
}
