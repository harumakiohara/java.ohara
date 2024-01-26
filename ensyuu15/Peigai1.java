package ensyuu15;

import java.util.Scanner;

public class Peigai1 {
    public static void main(String[] args) {
         Scanner stdIn =new Scanner(System.in);
         System.out.print("整数1 = ");
         int s1 = stdIn.nextInt();
         System.out.print("整数2 = ");
         int s2  = stdIn.nextInt();
         if (s2 == 0){
             System.out.println("0による割り算です!!");
         }
         else{
            double s = s1 / s2; 
            System.out.println(s1 + " / " + s2 + " = " + s);
         }

    }
}
