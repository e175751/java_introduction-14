package sample14_02;
public class Dice{
  int val;
  //コンストラクタ
  public Dice(int val){
    this.val = val;
    play();
  }
  public void play(){
    val = (int)(Math.random()*6) + 1;
  }
}
