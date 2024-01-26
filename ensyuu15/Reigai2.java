package ensyuu15;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Reigai2 {
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
        
      //整数を入力させ整数以外が入力された場合は例外処理を行う。
      try{
           System.out.print("整数を入力 = ");
           int s = stdIn.nextInt();
           //偶数か奇数化を判断して表示
           if (s % 2 == 0){
              System.out.println(s + "は偶数");
           }
           else if(s % 2 == 1){
            System.out.println(s + "は奇数");
           }
      }catch (InputMismatchException e){
            System.out.println("整数と認識できません!!");
      }
    
    }    
}
