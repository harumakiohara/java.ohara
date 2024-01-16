package ensyuu1;
import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字の入力：");
        String mozi = stdIn.next();
        System.out.print("整数の入力：");
        int meny = stdIn.nextInt();
        System.out.print("小数の入力：");
        float syousuu = stdIn.nextFloat();
        System.out.println("入力された文字 = " + mozi);
        System.out.println("入力された整数 = " + meny);
        System.out.println("入力された小数 = " + syousuu);



    }
}
