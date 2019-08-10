package chapter10_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TextFileInputPathDemo {
	public static void readingFile(){
		Scanner scan = null;
		String path = "/Users/samirhajjat/Desktop/School/Project_X/SQL lectrue 2";
		File fileObject = new File(path);
		if(!fileObject.exists()) {
			System.out.println("file is no where to be found");
		}else if (!fileObject.canRead()){
			System.out.println("File is found but cant be read");
		}
		try{
			scan = new Scanner(new File(path));
		}catch (FileNotFoundException e){
			System.out.println("Path is incorrect "+e.getMessage());
			System.exit(666);
		}
		
		while (scan.hasNextLine())
			System.out.println(scan.nextLine());
		scan.close();
	}
	
	public static void main(String[] args) {
		readingFile();
		settingPath();
	}
	
	public static void settingPath(){
		System.out.println("Enter Path :");
		File path = new File(new Scanner(System.in).nextLine());
		if(!path.exists()){
			System.out.print("Path does not exist please ");
			settingPath();
		}else if (!path.canRead() || !path.canWrite()){
			System.out.print("Path cant be Read or Written please ");
			settingPath();
		}
		
	}
}
