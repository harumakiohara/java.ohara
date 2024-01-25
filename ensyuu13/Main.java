package ensyuu13;

//抽象クラスPerson
abstract class Person {
    public String name = "";
    public String job = "";
    
    //抽象メソッド
    abstract void introduce();
    
    //コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    
}

//Personを継承したTeacherクラス
class Teacher extends Person{
    private String subject = "";

    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }
    
    @Override public void introduce(){
        System.out.println("氏名:" + this.name);
        System.out.println("職業:" + this.job);
        System.out.println("担当科目:" + this.subject);
    }
    

}

//Personを継承したCookクラス
class Cook extends Person{
    private String specialties = "";

    public Cook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }
    
    

    @Override public void introduce(){
        System.out.println("氏名:" + this.name);
        System.out.println("職業:" + this.job);
        System.out.println("得意料理:" + this.specialties);
    }
    

}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

        teacher.introduce();
        System.out.println();
        cook.introduce();
    }
}
