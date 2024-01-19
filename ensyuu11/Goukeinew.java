package ensyuu11;
import ensyuu11.Goukei;
public class Goukeinew {
    public static void main(String[] args) {
        //x,yをそれぞれクラス変数に代入する
        Goukei x = new Goukei();
        Goukei y = new Goukei();
        x.setNum(100);
        y.setNum(200);
        //クラス変数x,yを取り出してTotalを実行
        x.Total(x.getNum(), y.getNum());
        //結果を表示
        System.out.println("100から200までの合計値は" + x.total + "です。");
    }
}
