package ensyuu13;

public class Main3 {
     public static void main(String[] args) {
        Person3[] person = new Person3[2];
        //TeacherクラスとCookクラスを参照
        person[0] = new Teacher3("竹井一馬","教員","情報処理");
        person[1] = new Cook3("大原太郎","シェフ","オムライス");
        

        Person3 p = new Cook3(null, null, null)
        //結果を表示
        for (Person3 p : person){
           p.introduce();
           System.out.println();
        }
     }    
}
