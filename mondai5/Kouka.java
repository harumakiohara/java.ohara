package mondai5;

import java.util.Scanner;

public class Kouka {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        //StringBuilderフィールドsb
        StringBuilder sb = new StringBuilder();

        //現在のパスワードを入力させる
        System.out.print("現在のパスワードを入力してください:");
        String pass = stdIn.next();

        //文章を表示
        System.out.println("セキュリティ上の問題を発見しました。");
        
        //passの文字数を参照する変数lenpass
        int lenpass = pass.length();
        
        //入力されたパスワードをsbに逆順に格納するfor文
        for (int c = lenpass; c >= 1; c--){
            int start = c - 1; 
            //変数reverseにパスワードの最後尾の文字を代入
            String reverse = (pass.substring(start,c));
            //reverseをsbに格納
            sb.append(reverse);
        }
        
        //結果を表示
        System.out.println("セキュリティを強化したパスワードを作成しました。");
        System.out.println("こちらをお使いください");
        System.out.println("新しいパスワードは”" + sb + "”です。");
        
    }
}
