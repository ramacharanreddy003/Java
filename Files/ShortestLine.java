import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ShortestLine{
    public static void main(String[] args)throws IOException{
        File file = new File("D:\\JAVA\\Files\\Java.txt");
    
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line =br.readLine();
        String ShortestLine=line;
        int minLength=line.length();    
        while((line=br.readLine()) != null){
            if(line.length()  < minLength){
                minLength=line.length();
                ShortestLine=line;
            }
            System.out.println("Shortest line is : "+ShortestLine);
            System.out.println("Length is: "+minLength);
        }
    }
}
