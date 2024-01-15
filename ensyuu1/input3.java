package ensyuu1;
import java.util.Scanner;
public class input3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("年：");
        int year = stdIn.nextInt();
        System.out.print("月：");
        int month = stdIn.nextInt();
        System.out.print("日：");
        int day = stdIn.nextInt();
        System.out.println(year + "/" + month + "/" + day);


    }
}
