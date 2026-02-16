import java.io.*;
import java.util.*;

public class Load {
    public Load(){

    }
    public void load(){
        BufferedReader br = null;
        String fileName="student.txt";
        try{
            File file= new File(fileName);
            br = new BufferedReader(new FileReader(file));
            String line;
            while((line=br.readLine()) != null){
                String[] data=line.split(",");
                Student s =new Student(
                    data[0],
                    data[1],
                    Integer.parseInt(data[2]),
                    data[3],
                    Integer.parseInt(data[4]),
                    data[5],
                    data[6],
                    data[7],
                    data[8],
                    Integer.parseInt(data[9]),
                    data[10],
                    Integer.parseInt(data[11]));
                Set_student.studentList.add(s);
            }
        }catch(Exception e){
            System.out.println(e.getMessage()+"正しいファイル名を指定してください");
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ファイルを閉じるのに失敗しました");
            }
        }
    }
}
