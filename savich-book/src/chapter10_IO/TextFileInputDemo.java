package chapter10_IO;

import java.io.*;
import java.util.Scanner;

public class TextFileInputDemo {
	static String  fileName = "dobedo";
	public static void writingDodedo(){
		PrintWriter testStream = null;
		
		try{
			testStream = new PrintWriter(fileName);
		}catch (FileNotFoundException e ){
			System.out.println("No file found with name "+fileName + " "+e.getMessage());
		}
		testStream.println("Hello....");
		testStream.println("is it me you looking for....");
		testStream.close();
	}
	
	public static void readingDodedo(){
		Scanner scanThis = null;
		try {
			scanThis = new Scanner((new File(fileName)));
		//	if(scanThis instanceof Scanner ) throw new FileNotFoundException();
		}catch (FileNotFoundException e){
			System.out.println("where is the file you promised ");
		}
	while(scanThis.hasNextLine()){
		System.out.println(scanThis.nextLine());
	}
	
	}
	public static void main(String[] args) {
		//WritingSomething();
		writingDodedo();
		readingDodedo();
		
	}
	public static void WritingSomething(){
		String fileName = "out.txt";
		Scanner inputStream =null;
		System.out.println("The file "+fileName+"\ncontains the following lines:\n");
		
		try{
			inputStream = new Scanner(new File(fileName));
		}catch (FileNotFoundException e){
			System.out.println("Error opening the file "+e.getMessage());
			System.exit(1);
		}
		while (inputStream.hasNextLine()){
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		inputStream.close();
	}
}
