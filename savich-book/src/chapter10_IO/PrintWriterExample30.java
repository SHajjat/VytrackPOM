package chapter10_IO;

import java.io.*;

public class PrintWriterExample30 {// class to read and write txt files
	
	
	public static void main(String[] args) {
		String fileName = "out2.txt";
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(new FileOutputStream(fileName, true)); // it always start with empty file,
			// if you have file with same name it will be cleared
			//if it doesnt exist a new file will be made
		} catch (FileNotFoundException e) {
			//if exception is thrown it does not necessarily mean that the file was not found, after all , if
			//you are creating a new file, it doesnt already exist.
			//an exception would mean that the file could not be created because, for example the file name was already being used for a folder
			//name
			System.out.println(e.getMessage());
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
			
			
		}
		chapter10_IO.City1 c1 = new chapter10_IO.City1("Irbid",23,.23);
		outputStream.println(c1);
		outputStream.close();
		System.out.println("File saved in "+fileName);
		
	}
}
	

