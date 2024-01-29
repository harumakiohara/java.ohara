package ensyuu4;

import java.util.Scanner;

public class Score13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("0~100までの得点(整数値)を入力してください:");
        int a = stdIn.nextInt();
        if ( a < 0 || a > 100){
            System.out.println("入力値が不正です");
        }
        else if (a == 100) {
            System.out.println("満点合格です");
        }
        else if(a >= 60){
            System.out.println("合格です");
        }
        else{
            System.out.println("不合格です");
        }
    }     
}
