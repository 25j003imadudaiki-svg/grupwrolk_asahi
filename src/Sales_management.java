import java.util.Scanner;

public class Sales_management {
    private Scanner sc =new Scanner(System.in,"Shift-JIS");
    public Sales_management(){
        
    }
    public void sales_menu(){
        System.out.println("");
        System.out.println("1,本日の売上一覧");
        System.out.println("2,月別売上一覧");
        System.out.println("3,売上詳細表示");
        System.out.println("0,戻る");

        try{
            System.out.println("");
            System.out.print("選択してください:");
            String input = sc.nextLine();
            int set= Integer.parseInt(input);
            if(set==1){
                daily_sales();
            }else if(set==2){
                monthly_sales();
            }else if(set==3){
                sales_details();
            }else if(set==0){
                App.home();
            }else{
                System.err.println("0~3の数字を入力してください");
            }
        }catch (NumberFormatException e){
            System.err.println("数字を入力してください");
        }
    }
    public void daily_sales(){

    }
    public void monthly_sales(){

    }
    public void sales_details(){

    }


}
