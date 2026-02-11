public class Student {
    String name;
    String address;
    int age;
    long phonenumber;
    String course;
    int point;

    public Student(String name, String address, String course, int age, long phonenumber, int point  ){
        this.name = name;
        this.address = address;
        this.course = course;
        this.age = age;
        this.phonenumber = phonenumber;
        this.point = point;
    }

    public String getname(){
        return this.name;
    
    }
    public String getaddress(){
        return this.address;
    }
    public String getcourse(){
        return this.course;
    }
    public int getage(){
        return this.age;
    }
    public int getpoint(){
        return this.point;
    }
    public long getphonenumber(){
        return this.phonenumber;
    }
    public void setpoint(int point){
        this.point = point;
    }
}
