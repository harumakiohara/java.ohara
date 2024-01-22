package ensyuu12;

import java.util.Scanner;
import java.lang.Math;

class Calculator {
    Scanner stdIn = new Scanner(System.in);
    
    int x;
    int y;

    void Hikisuu(){
        System.out.print("整数を入力してください:");
        x = stdIn.nextInt();
        System.out.print("整数を入力してください:");
        y = stdIn.nextInt();
        return;
    }

    void ClacSum(int x, int y){
        int sum = x + y;
        System.out.println("Sum " + x + " and " + y + " = " + sum);
    }
    
    void ClacAve(int x, int y){
        int ave = (x + y) / 2;
        System.out.println("Average " + x + " and " + y + " = " + ave);
    }
}


class MoreClac extends Calculator{
    void clacPow(int x, int y){
        double pow = Math.pow(x, y);
        int result = (int)pow;
        System.out.println("Power " + x + " of " + y + " = " + result);
    }

}

public class Keisyou {
      public static void main(String[] args) {
          Calculator cal = new Calculator();
          MoreClac mcal = new MoreClac();
          cal.Hikisuu();
          cal.ClacSum(cal.x, cal.y);
          cal.ClacAve(cal.x, cal.y);
          mcal.clacPow(cal.x, cal.y);
          
      }
}