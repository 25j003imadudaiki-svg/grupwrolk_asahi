import java.util.Scanner;

public class Purchase_points {
    private int point;
    private Scanner sc=new Scanner(System.in,"Shift-JIS");
 public Purchase_points(int p){
    this.point=p;
 }public void points_menu(){
    boolean w=true;
    while (w) {
        System.out.println("==========================");
        System.out.println("ポイント購入システム");
        System.out.println("==========================");
        System.out.println("1,ポイント購入");
        System.out.println("0,終了");
        try{
            System.out.println("");
            System.out.print("番号を入力してください:");
            String input = sc.nextLine();
            int set = Integer.parseInt(input);

            if(set==1){
                point_pure();
            }else if(set==0){
                w=false;
                App.home();
            }else{
                System.out.println("1,0を入力してください");
            }
        }catch (NegativeArraySizeException e){
            System.out.println("不正な入力です");
        }
    }

 }public void point_pure(){
    boolean w=true;
    while (w) {
        System.out.println("");
        System.out.println("ポイント購入");
        System.out.println("ポイント数を入力してください(200ポイントから購入可能)");
        System.out.println("1ポイント=1000円");
        try{
            System.out.println("");
            System.out.print("<<");
            String set=sc.nextLine();
            this.point=Integer.parseInt(set);

            if(point>=200){
                System.out.println("");
                System.out.println("購入ポイント数:"+this.point);
                System.out.println("支払金額:"+(this.point * 1000)+"円");
                w=false;
            }else{
                System.out.println("200以上しか購入できません!");
            }
        }catch (NumberFormatException e){
            System.out.println("数字を入力してください!");
        }
    }
    check_point();
 }
 public void check_point(){
    boolean w=true;
    while (w) {
        System.out.println("");
        System.out.println("支払い確認");
        System.out.println("支払い方法:クレジットカード");
        System.out.println("支払い金額:"+(this.point * 1000)+"円");
        System.out.println("");
        System.out.println("支払いを実行しますか?");
        System.out.println("1,はい");
        System.out.println("2,いいえ");
        try{
            System.out.println("");
            System.out.print("番号を入力してください");
            String input = sc.nextLine();
            int set=Integer.parseInt(input);

            if(set==1){
                w=false;
            }else if(set==2){
                w=false;
                point_pure();
            }else{
                System.out.println("1,2を入力してください");
            }
        }catch (NegativeArraySizeException e){
            System.out.println("数字を入力してください");
        }
    }
    payment();
 }
 public void payment(){
    //if(クレジットカード!=null){
    //System.err.println("支払い完了");}
    int am=this.point * 1000;
    Point pt = new Point(null, this.point, am);
    System.out.println("");
    System.out.println("購入ポイント:"+this.point+"ポイント");
    System.out.println("現在の保有ポイント:500");
    System.out.println("");
    System.out.println("Enterキー押すとメインメニューに戻ります");
    sc.nextLine();
    points_menu();
 }
}
