package ensyuu13;

abstract class Person {
    String name = "";
    String job = "";
    
    //抽象メソッド
    abstract void introduce();
    
    //コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    
}
