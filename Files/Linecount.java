import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class Linecount{
    public static void main(String[] args) throws IOException{
        File file = new File("D:\\JAVA\\Files\\Java.txt");
        int Linecount=0;

        BufferedReader br = new BufferedReader(new FileReader(file));
        while(br.readLine() != null){
            Linecount++;
        }
        System.out.println("No of lines: "+Linecount);
        br.close();
    }
}