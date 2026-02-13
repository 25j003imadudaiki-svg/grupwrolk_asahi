import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.NotSerializableException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Set_student {
    public static ArrayList<Student> studentList = new ArrayList<>();
    private Scanner sc =new Scanner(System.in,"Shift-JIS");
    public Set_student(){

    }
    public void set_menu(){
        boolean w=true;
        while (w) {
            System.out.println("");
            System.out.println("新規生徒登録");
            System.out.println("コース選択");
            System.out.println("以下から希望するコースの番号を入力してください");
            System.out.println("");
            System.out.println("1,日常会話コース");
            System.out.println("2,留学準備コース");
            System.out.println("3,ビジネスコース");
            System.out.println("4,キッズコース");
            String cose="";

            try{
                System.out.println("");
                System.out.print("希望するコース");
                String input = sc.nextLine();
                int set=Integer.parseInt(input);

                if(set==1){
                    w=false;
                    cose="日常会話コース";
                    level_set(cose);
                }else if(set==2){
                    w=false;
                    cose="留学準備コース";
                    level_set(cose);
                }else if(set==3){
                    w=false;
                    cose="ビジネスコース";
                    level_set(cose);
                }else if(set==4){
                    w=false;
                    cose="キッズコース";
                    student_informationkid(cose);
                }else{
                    System.out.println("1~4の数字を入力してください");
                }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください");
            }

        }
    }
    public void level_set(String cose){
        boolean w=true;
        String level="";
        while (w) {
            System.out.println("");
            System.out.println("レベル選択");
            System.out.println("1,初級");
            System.out.println("2,上級");

            try{
                System.out.println("");
                System.out.print("希望するレベル:");
                String input=sc.nextLine();
                int set=Integer.parseInt(input);

                if(set==1){
                    w=false;
                    level="初級";
                    student_information(level,cose);
                }else if(set==2){
                    w=false;
                    level="上級";
                    student_information(level,cose);
                }else{
                    System.out.println("1,2の数字を入力してください");
                }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください");
            }
        }
    }
    public void student_information(String level,String cose){
        boolean w=true;
        while (w) {
            System.out.println("");
            System.out.println("生徒基本情報");
            System.out.println("");
            System.out.print("氏名:");
            String name=sc.nextLine();
            String gender="";
            boolean s=true;
            while (s) {
                try{
                System.out.println("性別");
                System.out.println("1,男性");
                System.out.println("2,女性");
                System.out.println("");
                System.out.print("番号を入力してください:");
                String input=sc.nextLine();
                int set=Integer.parseInt(input);

                if(set==1){
                    s=false;
                    gender="男性";
                }else if(set==2){
                    s=false;
                    gender="女性";
                }else{
                    System.out.println("1,2の数字を入力してください");
                }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください");
            }                
            }
            System.out.print("メールアドレス:");
            String gmail=sc.nextLine();
            System.out.print("住所:");
            String address=sc.nextLine();
            System.out.print("電話番号:");
            String call =sc.nextLine();
            int byear=0;
            s=true;
            while (s) {
                try{
                System.out.print("生年月日:");
                String input=sc.nextLine();
                byear=Integer.parseInt(input);
                
                s=false;

            }catch(NumberFormatException e){
                System.out.println("数字を入力してください");
            }
            }
            System.out.print("クレジットカード番号:");
            String credit_number=sc.nextLine();
            s=true;
            while (s) {
                try{
              System.out.println("");
              System.out.println("1,確認画面へ");
              System.out.println("2キャンセル");
              System.out.println("");
              System.out.print("<<");
              String input=sc.nextLine();
              int set=Integer.parseInt(input);

              if(set==1){
                s=false;
                w=false;
                content_confirmation(name,gender,gmail,address,call,byear,credit_number,level,cose);
              }else if(set==2){
                s=false;
                w=false;
                set_menu();
              }else{
                System.out.println("1,2の数字を入力してください");
              }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください");
            }
            }
        }
    }
    public void student_informationkid(String cose){
        boolean w=true;
        while (w) {
            System.out.println("");
            System.out.println("生徒基本情報");
            System.out.println("");
            System.out.print("氏名:");
            String name=sc.nextLine();
            String gender="";
            boolean s=true;
            while (s) {
                try{
                System.out.println("性別");
                System.out.println("1,男性");
                System.out.println("2,女性");
                System.out.println("");
                System.out.print("番号を入力してください:");
                String input=sc.nextLine();
                int set=Integer.parseInt(input);

                if(set==1){
                    s=false;
                    gender="男性";
                }else if(set==2){
                    s=false;
                    gender="女性";
                }else{
                    System.out.println("1,2の数字を入力してください");
                }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください");
            }                
            }
            System.out.print("メールアドレス:");
            String gmail=sc.nextLine();
            System.out.print("住所:");
            String address=sc.nextLine();
            System.out.print("電話番号:");
            String call =sc.nextLine();
            int byear=0;
            s=true;
            while (s) {
                try{
                System.out.print("生年月日:");
                String input=sc.nextLine();
                byear=Integer.parseInt(input);
                
                s=false;

            }catch(NumberFormatException e){
                System.out.println("数字を入力してください");
            }
            }
            System.out.print("クレジットカード番号:");
            String credit_number=sc.nextLine();
            s=true;
            while (s) {
                try{
              System.out.println("");
              System.out.println("1,確認画面へ");
              System.out.println("2キャンセル");
              System.out.println("");
              System.out.print("<<");
              String input=sc.nextLine();
              int set=Integer.parseInt(input);

              if(set==1){
                s=false;
                w=false;
                content_confirmationkid(name,gender,gmail,address,call,byear,credit_number,cose);
              }else if(set==2){
                s=false;
                w=false;
                set_menu();
              }else{
                System.out.println("1,2の数字を入力してください");
              }
            }catch (NumberFormatException e){
                System.out.println("数字を入力してください");
            }
            }
        }
    }
    public void content_confirmation(String name,String gender,String email,String address,String call,int byear,String credit_number,String level,String cose){
        System.out.println("");
        System.out.println("登録内容確認");
        System.out.println("");
        System.out.println("氏名:"+name);
        System.out.println("性別:"+gender);
        System.out.println("メールアドレス:"+email);
        System.out.println("住所:"+address);
        System.out.println("電話番号:"+call);
        System.out.println("生年月日:"+byear);
        System.out.println("クレジットカード番号:"+credit_number);
        System.out.println("");
        System.out.println("生徒区分");
        System.out.println("レベル:"+level);
        System.out.println("コース:"+cose);
        System.out.println("");
        System.out.println("1,登録する");
        System.out.println("2,修正する");
        System.out.println("3,キャンセル");
        boolean s=true;
        while(s){
            try{
                System.out.println("<<");
                String input = sc.nextLine();
            int set=Integer.parseInt(input);

            if(set==1){
                savestudentdata(name,gender,email,address,call,byear,credit_number,level,cose);
                System.out.println("登録完了");
                s=false;
                App.home();
            }else if(set==2){
                student_information(level,cose);
                s=false;
            }else if(set==3){
                App.home();
                s=false;
            }else{
                System.out.println("1~3の数字を入力してください");
            }
        }catch (NumberFormatException e){
            System.out.println("数字を入力してください");
        }
        }
        
    }
    public void content_confirmationkid(String name,String gender,String email,String address,String call,int byear,String credit_number,String cose){
        System.out.println("");
        System.out.println("登録内容確認");
        System.out.println("");
        System.out.println("氏名:"+name);
        System.out.println("性別:"+gender);
        System.out.println("メールアドレス:"+email);
        System.out.println("住所:"+address);
        System.out.println("電話番号:"+call);
        System.out.println("生年月日:"+byear);
        System.out.println("クレジットカード番号:"+credit_number);
        System.out.println("");
        System.out.println("生徒区分");
        System.out.println("コース:"+cose);
        System.out.println("");
        System.out.println("1,登録する");
        System.out.println("2,修正する");
        System.out.println("3,キャンセル");
        boolean s=true;
        while(s){
            try{
                System.out.println("<<");
                String input = sc.nextLine();
            int set=Integer.parseInt(input);

            if(set==1){
                System.out.println("登録完了");
                s=false;
            }else if(set==2){
                student_informationkid(cose);
                s=false;
            }else if(set==3){
                App.home();
                s=false;
            }else{
                System.out.println("1~3の数字を入力してください");
            }
        }catch (NumberFormatException e){
            System.out.println("数字を入力してください");
        }
        }
        
    }
    public void savestudentdata(String ne,String gdr,String em,String ads,String cl,int by,String cnb,String lv,String cs){
        int stID= studentList.size()+1;
        int age = 18;
        int inpoint=0;

        Student newst=new Student(ne, gdr, stID, cl, age, cnb, em, lv, ads, by, cs, inpoint);

        studentList.add(newst);
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("student.txt", true))))) {
            
            // Studentクラスの toCSV() メソッドを使ってカンマ区切りの文字列を取得
            pw.println(newst.toCSV());
            
            System.out.println("ファイル(" + "student.txt" + ")に保存しました。");

        } catch (IOException e) {
            System.err.println("ファイルの書き込みに失敗しました: " + e.getMessage());
        }
        
    }
}
