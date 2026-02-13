public class Student{
    private int studentID;//生徒番号
    private String name;//名前
    private int age;//年齢
    private String call;//電話番号
    private String email;//メアド
    private String cose;//コース
    private String address;//住所
    private int byear;//生年月日
    private String credit_number;//クレジット番号
    private int point;//ポイント
    private String level;//レベル
    private String gender;//性別
    private boolean isWithdrawn;//退会

    public Student(String gender,String level,int studentID,String name,int age,String call,String email,String cose,String address,int byear,String credit_number,int point){
        this.studentID=studentID;
        this.name=name;
        this.age=age;
        this.call=call;
        this.email=email;
        this.cose=cose;
        this.address=address;
        this.credit_number=credit_number;
        this.byear=byear;
        this.point=point;
        this.level=level;
        this.gender=gender;
        this.isWithdrawn=false;
    }
    public boolean getIsWithdrawn() {
        return this.isWithdrawn;
    }
    public void setWithdrawn(boolean status) {
        this.isWithdrawn = status;
    }
    String getLevel(){
        return this.level;
    }
    String getName(){
        return this.name;
    }
    int getStudentID(){
        return this.studentID;
    }
    int getAge(){
        return this.age;
    }
    String getAddress(){
        return this.address;
    }
    String getEmail(){
        return this.email;
    }
    String getCall(){
        return this.call;
    }
    int getPoint(){
        return this.point;
    }
    int getByear(){
        return this.byear;
    }
    String getCose(){
        return this.cose;
    }
    String getCredit_number(){
        return this.credit_number;
    }
    String getGender(){
        return this.gender;
    }
    void setPoint(int point){
        this.point+=point;
    }
    public String toCSV() {
        return studentID + "," + name + "," + gender + "," + age + "," + byear + "," + 
               email + "," + call + "," + address + "," + cose + "," + level + "," + 
               point + "," + credit_number + "," + isWithdrawn;
    }
    
}
