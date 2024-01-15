package ensyuu7;

public class while2 {
    public static void main(String[] args) {
        int x = 0;
        int total = 0;
        do {
           x++;
           total = total+ x;
        }while (x < 100);
        System.out.print("合計：" + total); 
    }
}
