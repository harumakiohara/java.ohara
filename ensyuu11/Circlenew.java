package ensyuu11;
import java.util.Scanner;
import ensyuu11.Circle;
class Circlenew {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("半径を整数値で入力:");
        int hankei = stdIn.nextInt();
        circle.hankei = hankei;
        double PI = circle.PI;
        circle.Ensyuu(hankei,PI);
        System.out.println("円周の長さは" + circle.ensyuu+ "です。");
        circle.Menseki(hankei, PI);
        System.out.println("円の面積は" + circle.result + "です。");
    }
}
