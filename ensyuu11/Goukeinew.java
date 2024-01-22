package ensyuu11;
import ensyuu11.Goukei;
public class Goukeinew {
    public static void main(String[] args) {
        Goukei goukei = new Goukei();
    int x = goukei.x;
    int y = goukei.y;
    goukei.Total(x,y);
    int total = goukei.total;
    System.out.println("100から200までの合計値は" + total + "です。");
    }
}