package ensyuu5;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("クラス番号(1~3)の値を入力してください:ssss");
        int course = stdIn.nextInt();
        if (course == 1){
            System.out.println("情報処理コース");
        } 
        else if (course == 2) {
            System.out.println("OAビジネスコース");
        }
        else if (course == 3){
            System.out.println("税理士コース");
        }
        else{
            System.out.println("不正な入力です");
        }
    }
}
