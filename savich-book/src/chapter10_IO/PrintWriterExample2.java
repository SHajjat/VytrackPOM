package chapter10_IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample2 {// class to read and write txt files
	
	
	public static void main(String[] args) {
		String fileName = "out2.txt";
		PrintWriter outputStream = null;
		
		try {
			outputStream = new PrintWriter(fileName); // it always start with empty file,
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
		Scanner keyboard = new Scanner(System.in);
		for ( int count = 1; count <= 3; count++ ) {
			System.out.println("what you wanna put as line number "+count);
			String line = keyboard.nextLine();
			outputStream.println(count+" "+line);
		}
		outputStream.close();
		System.out.println("those lines were written to "+ fileName);
		
	}
}
	

