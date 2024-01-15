package ensyuu7;

public class while1 {
    public static void main(String[] args) {
        int x = 0;
        int total = 0;
        while (x < 100) {
           x++;
           total = total+ x;
        }
        System.out.print("合計：" + total); 
    }
}
