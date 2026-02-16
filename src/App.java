import java.util.Scanner;

public class App {
    static Scanner sc=new Scanner(System.in,"Shift-JIS");
    public static void main(String[] args) throws Exception {
        // login();
        home();
        Load ld=new Load();
        ld.load();

    }
    public static void home(){
        boolean w = true;
        while (w) {
            System.out.println("");
            System.out.println("1,新規生徒登録");
            System.out.println("2,レッスン予約");
        System.out.println("3,ポイント購入");
        System.out.println("4,売上管理");
        System.out.println("5,退会");
        System.out.println("");
        System.out.print("選択:");

        try{
            String inpuut = sc.nextLine();
            int set=Integer.parseInt(inpuut);
            if(set==1){
                Set_student ss=new Set_student();
                ss.set_menu();
            }else if(set==2){
                w=false;
            }else if(set==3){
                w=false;
                Purchase_points p =new Purchase_points(0);
                p.points_menu();
            }else if(set==4){
                Sales_management s= new Sales_management();
                s.sales_menu();
            }else if(set==5){
                w=true;
                
            }else{
                System.err.println("1~5の数字を入力してください");
            }
        }catch (NumberFormatException e){
            System.out.println("数字を入力してください");
        }
        }
        
    }
    
}
