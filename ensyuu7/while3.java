package ensyuu7;
import java.util.Scanner;
public class While3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値を入力：");
        int kazu = stdIn.nextInt();
        int l = Integer.toString(kazu).length();
        int c = l-1;  
        Integer i = Integer.valueOf(kazu); 
        String k = i.toString();
        do {
          System.out.print(k.charAt(c));
          c -= 1;
        }while (c >= 0);
    }
}
