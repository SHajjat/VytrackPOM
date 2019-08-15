package chapter10_IO;

import java.io.*;

public class PrintWriterExample40 {
	
	public static void main(String[] args) {
		PrintWriter outputStream =null;
		String fileName = "10lines.text";
		
		try {
			outputStream = new PrintWriter(fileName);
		}catch (FileNotFoundException e){
			e.getMessage();
			System.exit(0);
		}
		for(int i = 1 ; i <=10 ; i++)
		outputStream.println("hello number "+i );
		outputStream.close(); // or outputStream.flush();
		
	}
}
