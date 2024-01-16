package ensyuu5;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //メッセージを表示
        System.out.print("A~Dの値を入力してください:");
        String score = stdIn.next();
        if (score == "A")
           System.out.println("ランクAは評価「良」です");
        else if (score == "B")
           System.out.println("ランクBは評価「良」です");
        else if (score == "C")
           System.out.println("ランクCは評価「可」です");
        else if (score == "D")
           System.out.println("ランクDは評価「不可」です");
    }
}
