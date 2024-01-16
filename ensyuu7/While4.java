package ensyuu7;

public class While4 {
    public static void main(String[] args) {
        int n = 1;
        int total = 0;
        while(total <= 100000){
            n += 1;
            total += n;
        }
        System.out.println("合計が100000を超えるnは" + n + "です");
    }
}
