package chapter10_IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample1 {// class to read and write txt files
	String fileName = "out.csv";
	PrintWriter outputStream;
	
	public void outStream() {
		
		try {
			outputStream = new PrintWriter(fileName); // it always start with empty file,
			// if you have file with same name it will be cleared
			//if it doesnt exist a new file will be made
		}catch (FileNotFoundException e){
			//if exception is thrown it does not necessarily mean that the file was not found, after all , if
			//you are creating a new file, it doesnt already exist.
			//an exception would mean that the file could not be created because, for example the file name was already being used for a folder
			//name
			System.out.println(e.getMessage());
			System.out.println("Error opening the file "+fileName);
			System.exit(0);
			
			
	}
		outputStream.println("This is Line 1.");
		outputStream.println("This is Line 2.");
		outputStream.close();
	}
	
	}
class creater1 {
	public static void main(String[] args) {
		PrintWriterExample1 print = new PrintWriterExample1();
		print.outStream();
		
	}
}
