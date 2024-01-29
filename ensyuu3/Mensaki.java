package ensyuu3;

import java.util.Scanner;

public class Mensaki {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("長方形の面積を求めます");
        System.out.print("縦の長さ:");
        int vertical = stdIn.nextInt();
        System.out.print("横の長さ:");
        int horizontal = stdIn.nextInt();
        float mensaki = vertical * horizontal;
        System.out.println("長方形の面積 = " + mensaki);
    }
}
