package chapter10_IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextInputDemo3 {
	public static void openFile(String path , PrintWriter stream ) throws FileNotFoundException {
		stream = new PrintWriter(path);
	}
	
	public static void main(String[] args) {
		PrintWriter toFile=null;
		try {
			openFile("dobedo", toFile);
			toFile.println("hello");
			toFile.println("dina");
			toFile.close();
		}catch (FileNotFoundException | NullPointerException e){
			System.out.println(e.fillInStackTrace());
		}
	}
}
