package Task;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program10 {
	public static void main(String[] args)throws IOException {
		try {
		File f=new File("C:\\Users\\Asus\\OneDrive\\Documents\\file.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		
		while((temp =fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch(IOException z) {
			System.out.println("file");
		}
		//System.out.println("End");
	}

}
