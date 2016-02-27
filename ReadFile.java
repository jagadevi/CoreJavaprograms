import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.RandomAccess;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Jagadevi\\2016\\Jobs\\test.txt";
		File file = new File(filePath);
		try {
			FileReader eader = new FileReader(file);
			BufferedReader buf = new BufferedReader(eader);
			String line;
			try {
				while ((line=buf.readLine()) != null)
				{
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			buf.close();
			
			FileWriter write = new FileWriter(file, true);
			
			BufferedWriter bw = new BufferedWriter(write);
			
			bw.newLine();
			
			
			bw.append("New line added");
bw.newLine();
bw.append("New line added");
			bw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
