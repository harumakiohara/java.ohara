package ensyuu14;

import java.util.Scanner;

public class Moziretu3 {
    public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       System.out.print("文字列を入力:");
       String retu = stdIn.next();
       sb.append(retu);
       sb.setLength(10);
       System.out.print("結果文字列:");
       System.out.println(sb);
    }
    
}
