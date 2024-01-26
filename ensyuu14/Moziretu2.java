package ensyuu14;

import java.util.Scanner;

public class Moziretu2 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("文字列を入力:");
    String input = stdIn.next();
    String newinput = new String(input);
    int inputl = newinput.length();
    System.out.println("入力された文字数は" + inputl + "です。");
  }
}
