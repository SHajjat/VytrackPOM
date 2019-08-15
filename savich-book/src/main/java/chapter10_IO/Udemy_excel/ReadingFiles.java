package chapter10_IO.Udemy_excel;

import java.io.*;

public class ReadingFiles {
	public static void main(String[] args) throws IOException {
		
		String path = "/Users/samirhajjat/Desktop/School/Project_X/savich-book/MyTextFile.txt";
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
//		System.out.println(reader.readLine());
//		System.out.println(reader.readLine());
		String line =null;
		while ((line =reader.readLine())!=null){ // reader.readLine() will read the line and go to the next one
			System.out.println(line);
		}
		reader.close();
	}
}
