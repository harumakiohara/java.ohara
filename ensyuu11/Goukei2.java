package ensyuu11;

public class Goukei2 {
   int a;
   int x;
   int y;
   int total = 0;
   
   //x,yをインスタンス変数に設定するためのsetNum
   void setNum(int value){
    a = value;
   }
   
   //インスタンス変数を取り出すgetNum
   int getNum(){
    return a;
   }
   
   //x,yの二つの変数からxからyまでの合計値を求めて結果を返すTotal
   void Total(int x,int y){
    for (int c = x; c <= y; x++){
       total += c;
       c += 1;
    }
    return;
   }

}
