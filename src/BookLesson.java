import java.util.ArrayList;
import java.util.Scanner;
public class BookLesson {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String date;
    private String time;
    private String instructor;
    private String type;
    private int requiredPoints;
    private int currentParticipants;

    public BookLesson(int id, String date, String time, String instructor, String type, int requiredPoints) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.instructor = instructor;
        this.type = type;
        this.requiredPoints = requiredPoints;
        this.currentParticipants = 0;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRequiredPoints() {
        return requiredPoints;
    }

    public void setRequiredPoints(int requiredPoints) {
        this.requiredPoints = requiredPoints;
    }

    public int getCurrentParticipants() {
        return currentParticipants;
    }

    public void setCurrentParticipants(int currentParticipants) {
        this.currentParticipants = currentParticipants;
    }

   public void lessonMenu(){
        try {

            System.out.print("レッスンIDを入力してください (例: 4): ");
            this.setId(Integer.parseInt(sc.nextLine())); // IDのセッターを使用

            System.out.print("日付を入力してください (例: 2026-04-03): ");
            this.setDate(sc.nextLine());                 // 日付のセッターを使用

            System.out.print("時間を入力してください (例: 14:00): ");
            this.setTime(sc.nextLine());                 // 時間のセッターを使用

            System.out.print("講師名を入力してください: ");
            this.setInstructor(sc.nextLine());           // 講師名のセッターを使用

            System.out.print("形式を入力してください (マンツーマン または グループ): ");
            this.setType(sc.nextLine());                 // 形式のセッターを使用

            System.out.print("消費ポイントを入力してください (例: 50): ");
            this.setRequiredPoints(Integer.parseInt(sc.nextLine())); // 消費ポイントのセッターを使用

            // 注意: 新しいレッスンは予約者0人から始まるため、現在の参加人数の入力は求めません。
            // this.setCurrentParticipants(0);
            
            

            // 3. 作成完了の確認メッセージ
            System.out.println("\n✅ 新しいレッスンの作成が完了しました！");
            System.out.println("詳細: " + this.getDate() + " | " + this.getInstructor() + " | " + this.getRequiredPoints() + "pt");

        } catch (NumberFormatException e) {
            // "10" ではなく "十" や "A" などを入力してしまった場合のエラー処理
            System.out.println("❌【エラー】無効な入力です！ID、消費ポイント、定員には必ず「数字」を入力してください。");
        }
    }
 }
    

        


   