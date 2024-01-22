package ensyuu11;
import ensyuu11.Goukei2;
public class Goukeinew2 {
    public static void main(String[] args) {
        //x,yをそれぞれインスタンス変数に代入する
        Goukei2 x = new Goukei2();
        Goukei2 y = new Goukei2();
        x.setNum(100);
        y.setNum(200);
        //インスタンス変数x,yを取り出してTotalを実行
        x.Total(x.getNum(), y.getNum());
        //結果を表示
        System.out.println("100から200までの合計値は" + x.total + "です。");
    }
}
