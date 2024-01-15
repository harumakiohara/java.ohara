package ensyuu6;
import java.util.Scanner;
public class for5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("入力文字列：");
        String retu = stdIn.next();
        int c = retu.length();
        for (int i = 0; i <= c; i++){
           System.out.println(retu.charAt(i));
        }
    }
}
