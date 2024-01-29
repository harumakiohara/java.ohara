package ensyuu14;

import java.util.Scanner;

public class Moziretu4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //StringBuilderフィールドsb
        StringBuilder sb = new StringBuilder();
        //2つの文字列を入力
        System.out.println("文字列を2つ入力してください。");
        System.out.print("1つ目文字列を入力:");
        String x = stdIn.next();        
        System.out.print("2つ目文字列を入力:");
        String y = stdIn.next();
        //2つの文字列を入力された順序でsbに格納
        sb.append(x);
        sb.append(y);
        //yの開始位置を検索し、開始位置が０文字目だった場合同じ文字列であると判断し結果を表示
        if (sb.indexOf(y) == 0){
            System.out.println("同じ文字列です。");
        }
        else{
            System.out.println("違う文字列です。");
        }
    }
}
