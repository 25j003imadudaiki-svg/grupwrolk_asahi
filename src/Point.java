public class Point {
private int pointamout;//ポイント数
private String day;//日付
private int amount;//金額
 
public Point(String d,int p,int a){
    this.day=d;
    this.pointamout=p;
    this.amount=a;
}int getPointamount(){
    return this.pointamout;
}String getDay(){
    return this.day;
}int getAmount(){
    return this.amount;
}void setPointamount(int point){
    this.pointamout=point;
}void setDay(String day){
    this.day=day;
}void setAmount(int amt){
    this.amount=amt;
}
}
