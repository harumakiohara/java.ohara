package ensyuu1;

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("お名前を入力してください＞");
        String name = stdIn.next();
        System.out.println("こんにちは" + name +"さん！");
    }
}
