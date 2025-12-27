import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\LineCounter\\Example.txt";
		int lineCount=0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			while(reader.readLine() != null) {
				lineCount++;
			}
			System.out.println("No of lines: "+lineCount);
		}catch(IOException e) {
			System.err.println("Error reading file: "+e.getMessage());
		}
				
	}



}
