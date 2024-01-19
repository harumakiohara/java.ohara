package ensyuu8;

import java.util.ArrayList;
import java.util.Arrays;

public class Hairetu9 {
    public static void main(String[] args) {
        //list_aとlist_bを作成
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {22, 33, 44, 55, 66};
        
        //2つのlistを足し算した数を代入する空のlist_c
        ArrayList<Integer> c = new ArrayList<>();
        
        //while文でlist_cに結果を代入
        int ct = 0;
        while (ct <= 4){
           int x = a[ct] + b[ct];
           c.add(x);
           ct += 1;
        }
        
        //結果を表示
        System.out.println("list_a = " + Arrays.toString(a));
        System.out.println("list_b = " + Arrays.toString(b));
        System.out.println("list_a + list_b = " + Arrays.toString(c.toArray()));
    }  
}
