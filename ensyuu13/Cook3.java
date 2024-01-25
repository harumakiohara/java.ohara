package ensyuu13;

public class Cook3 implements Person3 {
    public String name ="";
    public String job ="";
    public String specialties ="";
    
    //コンストラクタ
    public Cook3(String name, String job, String specialties) {
        this.name = name;
        this.job = job;
        this.specialties = specialties;
    }
    
    //情報を表示
    @Override public void introduce(){
        System.out.println("氏名:" + this.name);
        System.out.println("職業:" + this.job);
        System.out.println("得意料理:" + this.specialties);
    }
}
